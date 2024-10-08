package org.example;

public class Ex6 {

    public double digitAverage(int num) {
        int digits = String.valueOf(num).length();
        int sum = 0;

        for (int i = 0; i < digits; i++) {
            sum += Character.getNumericValue(String.valueOf(num).charAt(i));
        }

        double average = (double) sum / digits;
        System.out.println(digits + " digits.");
        System.out.println("Average: " + average);
        return average;
    }
}