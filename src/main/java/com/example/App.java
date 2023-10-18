package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        int length = input.length();
        System.out.println("Length of the word: " + length);

        scanner.close();
    }
}
