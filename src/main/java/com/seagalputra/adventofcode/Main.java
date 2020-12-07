package com.seagalputra.adventofcode;

import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReportRepair reportRepair = new ReportRepair();

        InputStream inputStream = Main.class.getResourceAsStream("/day1_report_repair.txt");
        List<Integer> reports = Utils.readFileFrom(inputStream);

        System.out.println(reportRepair.multiplyEntries(reports));
    }
}
