package com.andersenlab_trainee;

import java.util.Scanner;

public class NameTask {
    private static final String DEFAULT_NAME = "Вячеслав";
    private static final String SUCCESS_OUTPUT_MESSAGE = "Привет, Вячеслав";
    private static final String FAILED_OUTPUT_MESSAGE = "Нет такого имени";

    public static void checkEnteredName() {
        System.out.println("Enter name:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        if (userInput.trim().equalsIgnoreCase(DEFAULT_NAME)) {
            System.out.println(SUCCESS_OUTPUT_MESSAGE);
        } else {
            System.out.println(FAILED_OUTPUT_MESSAGE);
        }
    }
}