package com.program;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    public void showMenu() {
        switch (choice) {
            case 1:
                // Perform "original number" case.
                break;
            case 2:
                // Perform "encrypt number" case.
                break;
            case 3:
                // Perform "decrypt number" case.
                break;
            case 4:
                // Perform "quit" case.
                break;
            default:
                // The user input an unexpected choice.
        }
    }
}
