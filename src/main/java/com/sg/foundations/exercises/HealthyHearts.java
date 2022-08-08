package com.sg.foundations.exercises;

import java.util.Random;
import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        System.out.println("What is your age? ");
        int age = Integer.parseInt(scan.nextLine());
        int maxHr = 220-age;
        System.out.println("Your maximum heart rate should be " + maxHr + " beats per minute");
        System.out.println("Your target HR Zone is "+ Math.round(maxHr*0.5) + " - " + Math.round(maxHr*0.85) + " beats per minute");
    }
}
