package com.homework;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        String password = passwordGenerator.generatePassword(setPasswordLength(scanner));
        System.out.println("Generated password: " + password);
    }

    private static int setPasswordLength(Scanner sc) {
        System.out.print("Enter password length: ");
        return sc.nextInt();
    }
}