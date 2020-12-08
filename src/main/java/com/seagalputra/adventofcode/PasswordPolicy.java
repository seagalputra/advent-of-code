package com.seagalputra.adventofcode;

public class PasswordPolicy {
    private int min;
    private int max;
    private char character;
    private String body;

    public PasswordPolicy() {
    }

    public PasswordPolicy(int min, int max, char character, String body) {
        this.min = min;
        this.max = max;
        this.character = character;
        this.body = body;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "PasswordPolicy{" +
                "min=" + min +
                ", max=" + max +
                ", character='" + character + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
