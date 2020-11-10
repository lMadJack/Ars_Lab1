package com.program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    boolean temp = true;

    ContractRepo repo = new ContractRepo();

    public void showMenu() {
        while (temp) {
            switch (choice) {
                case 1:
                    System.out.println("Show all contracts");
                    //repo.showContracts();
                    break;
                case 2:
                    System.out.println("Add contract");
                    int id = scanner.nextInt();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    System.out.println("Enter date when contract is going to be started");
                    String str1 = scanner.next();
                    LocalDate dateStart = LocalDate.parse(str1, formatter);
                    System.out.println("Enter date when contract is going to be finished");
                    String str2 = scanner.next();
                    LocalDate dateEnd = LocalDate.parse(str2, formatter);
                    //repo.addContract(id, dateStart, dateEnd);
                    break;
                case 3:
                    System.out.println("Delete contract");
                    break;
                case 4:
                    temp = false;
                    break;
                default:
                    // The user input an unexpected choice.
            }
        }
    }
}
