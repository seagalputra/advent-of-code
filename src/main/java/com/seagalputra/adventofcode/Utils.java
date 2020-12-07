package com.seagalputra.adventofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Integer> readFileFrom(InputStream inputStream) {

        List<Integer> inputs = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                Integer number = Integer.parseInt(line);
                inputs.add(number);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return inputs;
    }
}
