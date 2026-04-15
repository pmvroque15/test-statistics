package com.pluralsight;

import java.util.Arrays;

public class Main {
    static void main() {
        int[] testScores = {96, 93, 40, 100, 97, 92, 95, 98, 94, 90};
        int sum = 0;
        int maxScore = testScores[0];
        int minScore = testScores[0];

        //Looping through array to get the sum, max, and min number
        for (int score : testScores) {
            sum = sum + score;
            minScore = Math.min(minScore, score);
            maxScore = Math.max(maxScore, score);
        }

        //Median
        int median = 0;
        Arrays.sort(testScores);
        if (testScores.length % 2 != 0) {
           int middleIndex = testScores.length / 2;
           median = testScores[middleIndex];
        } else if (testScores.length % 2 == 0) {
            int middle1 = testScores.length / 2;
            int middle2 = middle1 - 1;
            median = (testScores[middle1] + testScores[middle2]) / 2;
        }
        //Display output
        System.out.printf("Average: %s\n", (sum / testScores.length));
        System.out.printf("Highest number: %s\n", maxScore);
        System.out.printf("Lowest number: %S\n", minScore);
        System.out.printf("Median: %s\n", median);
    }
}
