package sampleprojects.dice;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Simulator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean appIsCompleted = false;

        do {
            try {
            System.out.print("How many times you want to roll a dice? ");
            int number = scanner.nextInt();

            appIsCompleted = true;

            System.out.println("Rolling " + number + " times");

            Random rand = new Random();

            for(int i=0; i<number; i++){

                int rolledNumber = rand.nextInt(6) + 1;
                System.out.println(display(rolledNumber));
            }

            } catch (InputMismatchException e){
                System.out.println("Not a valid number!");
                scanner.next();
            }
        } while (!appIsCompleted);

        scanner.close();
    }

    static String display(int value){
        return switch(value) {
            case 1 -> "-----------\n|         |\n|    o    |\n|         |\n-----------\n";
            case 2 -> "-----------\n| o       |\n|         |\n|       o |\n-----------\n";
            case 3 -> "-----------\n| o       |\n|    o    |\n|       o |\n-----------\n";
            case 4 -> "-----------\n| o     o |\n|         |\n| o     o |\n-----------\n";
            case 5 -> "-----------\n| o     o |\n|    o    |\n| o     o |\n-----------\n";
            case 6 -> "-----------\n| o  o  o |\n|         |\n| o  o  o |\n-----------\n";
            default -> "Not a valid number";
        };
    }
}
