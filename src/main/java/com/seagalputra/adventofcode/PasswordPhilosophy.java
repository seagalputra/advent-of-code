package com.seagalputra.adventofcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PasswordPhilosophy {
    public int countValidPassword(List<PasswordPolicy> passwordPolicies) {

        int validCount = 0;
        for (PasswordPolicy passwordPolicy : passwordPolicies) {
            Map<String, Integer> countCharacter = Arrays.stream(passwordPolicy.getBody()
                    .split(""))
                    .parallel()
                    .collect(Collectors.groupingBy(character -> character, Collectors.summingInt(character -> 1)));

            String character = String.valueOf(passwordPolicy.getCharacter());
            Integer counted = countCharacter.getOrDefault(character, 0);

            if (counted >= passwordPolicy.getMin() && counted <= passwordPolicy.getMax()) {
                validCount++;
            }
        }

        return validCount;
    }
}
