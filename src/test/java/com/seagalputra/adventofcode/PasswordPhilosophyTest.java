package com.seagalputra.adventofcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswordPhilosophyTest {

    private List<PasswordPolicy> passwordPolicies;
    private PasswordPhilosophy passwordPhilosophy;

    @BeforeEach
    void setUp() {
        passwordPhilosophy = new PasswordPhilosophy();
        passwordPolicies = new ArrayList<>();

        InputStream inputStream = getClass().getResourceAsStream("/day2_password_philosophy_test.txt");

        passwordPolicies = Utils.readFileFrom(inputStream, input -> {
            String[] tokens = input.replaceAll("(:\\s)|(\\s)|-", ":").split(":");
            return new PasswordPolicy(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[2].charAt(0), tokens[3]);
        });
    }

    @Test
    void shouldReturnCountOfValidPassword() {
        int countedValidPassword = passwordPhilosophy.countValidPassword(passwordPolicies);

        assertEquals(2, countedValidPassword);
    }

    @Test
    void shouldReturnNumberOfValidPasswordBasedOnPosition() {
        int countedValidPassword = passwordPhilosophy.countValidPasswordFromPosition(passwordPolicies);

        assertEquals(1, countedValidPassword);
    }
}