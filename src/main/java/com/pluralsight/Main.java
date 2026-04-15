package com.pluralsight;

public class Main {
    static void main() {
        int[] testScores = {96, 93, 40, 100, 97, 92, 95, 98, 94, 90};
        int sum = 0;
        int maxScore = testScores[0];
        int minScore = testScores[0];
        //Looping through array to get the sum
        for (int score : testScores) {
            sum = sum + score;
        }

        //Looping through array to get the max number
        for (int highestScore : testScores) {
            maxScore = Math.max(maxScore, highestScore);
        }
        for (int lowestScore : testScores) {
            minScore = Math.min(minScore, lowestScore);
        }

        //Looping through array to get the min number

        //Display output
        System.out.printf("Average: %s\n", (sum / testScores.length));
        System.out.printf("Highest number: %s\n", maxScore);
        System.out.printf("Lowest number: %S\n", minScore);

    }
}
