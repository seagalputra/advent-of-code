package com.seagalputra.adventofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Utils {

    public static <T> List<T> readFileFrom(InputStream inputStream, Function<String, T> transformer) {
        List<T> inputs = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                T result = transformer.apply(line);
                inputs.add(result);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return inputs;
    }

    private Utils() {
    }
}
