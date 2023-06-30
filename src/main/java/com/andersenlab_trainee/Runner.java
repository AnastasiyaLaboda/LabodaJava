package com.andersenlab_trainee;

import java.util.Scanner;

import static com.andersenlab_trainee.ArrayTask.*;
import static com.andersenlab_trainee.NameTask.*;
import static com.andersenlab_trainee.NumberTask.*;

public class Runner {
    public static void main(String[] args) {
        String taskNumber;
        do {
            printMenuForSelectingTaskToCheck();
            taskNumber = new Scanner(System.in).nextLine();
            switch (taskNumber) {
                case "1":
                    checkEnteredNumber();
                    break;
                case "2":
                    checkEnteredName();
                    break;
                case "3":
                    int[] array = new int[10];
                    fillArrayWithRandomNumbersAndPrint(array);
                    printDivisibleArrayElements(array);
                    break;
                default:
                    System.out.println("Invalid task number. Please try again.");
                    break;
            }
        }
        while (!taskNumber.trim().equalsIgnoreCase("exit"));
    }

    public static void printMenuForSelectingTaskToCheck() {
        System.out.println("\nEnter number to check the task:");
        System.out.println("1 - Task1" +
                "\n2 - Task2" +
                "\n3 - Task3" +
                "\nType 'EXIT' to quit.\n");
    }
}

