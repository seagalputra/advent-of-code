package com.seagalputra.adventofcode;

import java.util.List;

public class ReportRepair {

    public int multiplyEntries(List<Integer> expenseReport) {
        int found = 0;
        for (int i = 0; i < expenseReport.size(); i++) {
            for (int j = i + 1; j < expenseReport.size(); j++) {
                int totalExpense = expenseReport.get(i) + expenseReport.get(j);

                if (totalExpense == 2020) {
                    found = expenseReport.get(i) * expenseReport.get(j);
                }
            }
        }

        return found;
    }
}
