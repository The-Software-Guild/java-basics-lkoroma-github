package com.sg.foundations.exercises;

import java.util.Random;
import java.util.Scanner;

public class RockPaparScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        boolean again = true;
        while (again) {
            System.out.println("How many rounds do you want to play? (MAX 10)");
            int rounds = Integer.parseInt(scan.nextLine());
            int userWins = 0;
            int compWins = 0;
            int ties = 0;
            for (int i = 0; i < rounds; i++) {
                System.out.println("Rock - 1, Paper - 2 or Scissors - 3?");
                int choice = Integer.parseInt(scan.nextLine());
                int compChoice = r.nextInt((3 - 1) + 1) + 1;
                switch (choice) {
                    case 1 -> {
                        if (compChoice == 1) {
                            System.out.println("Tie, both choose Rock.");
                            ties++;
                            break;
                        }
                        if (compChoice == 2) {
                            System.out.println("You lose");
                            compWins++;
                            break;
                        }
                        System.out.println("You win");
                        userWins++;
                    }
                    case 2 -> {
                        if (compChoice == 1) {
                            System.out.println("You win.");
                            userWins++;
                            break;
                        }
                        if (compChoice == 2) {
                            System.out.println("Tie, both choose Paper.");
                            ties++;
                            break;
                        }
                        System.out.println("You lose");
                        compWins++;
                    }
                    case 3 -> {
                        if (compChoice == 1) {
                            System.out.println("You lose");
                            compWins++;
                            break;
                        }
                        if (compChoice == 2) {
                            System.out.println("You win");
                            userWins++;
                            break;
                        }
                        System.out.println("Tie, both choose Scissors.");
                        ties++;
                    }
                }
            }
            System.out.println("You won " + userWins + " times");
            System.out.println("You lost " + compWins + " times");
            System.out.println("You tied " + ties + " times");

            System.out.println("Do you want to play again? (\"Yes\" or \"No\")");
            if (scan.nextLine().equals("No")) {
                again = false;
            }
        }
    }
}
