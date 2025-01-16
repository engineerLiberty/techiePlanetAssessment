package com.engineerLee;

import java.util.Scanner;

public class TimeInWords {

    public static String timeInWords(int H, int M) {

        // Mapping numbers to their corresponding words
        String[] numWords = {
                "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four",
                "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "half", "quarter"
        };

        // Case 1: If minutes is 0, it's the hour in words
        if (M == 0) {
            return numWords[H] + " o'clock";
        }

        // Case 2: If minutes is between 1 and 30
        if (M <= 30) {
            if (M == 1) {
                return "one minute past " + numWords[H];
            } else if (M == 15 || M == 30) {
                return numWords[M] + " past " + numWords[H];
            } else {
                return numWords[M] + " minutes past " + numWords[H];
            }
        }

        int minutesTo = 60 - M;
        int nextHour = H + 1;
        if (nextHour > 12) {
            nextHour = 1;
        }

        if (minutesTo == 1) {
            return "one minute to " + numWords[nextHour];
        } else if (minutesTo == 15) {
            return "quarter to " + numWords[nextHour];
        } else {
            return numWords[minutesTo] + " minutes to " + numWords[nextHour];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values for hour and minute
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        System.out.println(timeInWords(H, M));

        scanner.close();
    }
}
