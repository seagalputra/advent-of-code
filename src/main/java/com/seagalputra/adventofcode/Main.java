package com.seagalputra.adventofcode;

import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Day 1 ---");
        ReportRepair reportRepair = new ReportRepair();

        InputStream day1Input = Main.class.getResourceAsStream("/day1_report_repair.txt");
        List<Integer> reports = Utils.readFileFrom(day1Input, Integer::parseInt);

        System.out.println(reportRepair.multiplyEntries(reports));
        System.out.println(reportRepair.multiplyThreeEntries(reports));

        System.out.println("--- Day 2 ---");
        PasswordPhilosophy passwordPhilosophy = new PasswordPhilosophy();

        InputStream day2Input = Main.class.getResourceAsStream("/day2_password_philosophy.txt");
        List<PasswordPolicy> passwordPolicies = Utils.readFileFrom(day2Input, input -> {
            String[] tokens = input.replaceAll("(:\\s)|(\\s)|-", ":").split(":");
            return new PasswordPolicy(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[2].charAt(0), tokens[3]);
        });

        System.out.println(passwordPhilosophy.countValidPassword(passwordPolicies));
    }
}
