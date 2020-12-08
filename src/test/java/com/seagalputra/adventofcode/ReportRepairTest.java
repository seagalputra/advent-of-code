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

        InputStream inputStream = getClass().getResourceAsStream("/day1_report_repair_test.txt");

        inputs = Utils.readFileFrom(inputStream, Integer::parseInt);
    }

    @Test
    void shouldFoundTwoNumbersAndMultiplyThem() {
        int expense = reportRepair.multiplyEntries(inputs);

        assertEquals(514579, expense);
    }

    @Test
    void shouldFoundThreeNumbersAndMultiplyThem() {
        int expense = reportRepair.multiplyThreeEntries(inputs);

        assertEquals(241861950, expense);
    }
}