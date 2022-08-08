package com.sg.foundations.exercises;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        System.out.println("What is your dog's name?");
        String name = scan.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + name +"'s prestigious background right here.");

        System.out.println(name + " is:");
        int total = 100;
        int val1 = r.nextInt((80-20)+1)+1;
        total-=val1;
        int val2 = r.nextInt((total-10)+1)+1;
        total-=val2;
        int val3 = r.nextInt((total-5)+1)+1;
        total-=val3;
        int val4 = r.nextInt((total-1)+1)+1;
        total-=val4;
        int val5 = total;
        System.out.println(val1 + "% St. Bernard\n" +
                val2 + "% Chihuahua\n" +
                val3 + "% Dramatic RedNosed Asian Pug\n" +
                val4 + "% Common Cur\n" +
                val5 + "% King Doberman");
        System.out.println("Wow, that's QUITE the dog!");
    }
}
