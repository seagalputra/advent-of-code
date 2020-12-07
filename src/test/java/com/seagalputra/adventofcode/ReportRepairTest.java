package com.seagalputra.adventofcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReportRepairTest {

    List<Integer> inputs;

    ReportRepair reportRepair;

    @BeforeEach
    void setUp() {
        reportRepair = new ReportRepair();
        inputs = new ArrayList<>();

        InputStream inputStream = getClass().getResourceAsStream("/day1_report_repair_test.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                Integer number = Integer.parseInt(line);
                inputs.add(number);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    @Test
    void shouldFoundTwoNumbersAndMultiplyThem() {
        int expense = reportRepair.multiplyEntries(inputs);

        assertEquals(514579, expense);
    }
}