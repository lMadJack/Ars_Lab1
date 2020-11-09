package com.program;

import com.program.Entities.*;

public class Main {
    public static void main(String[] args) {
//        Menu menu = new Menu();
//        menu.showMenu();
        ContractRepo repo = new ContractRepo();
        Client client = new Client();
        InternetContract IC = new InternetContract();
        PhoneContract PC = new PhoneContract();
        TVContract TVC = new TVContract();
        repo.contracts.add(IC());
        System.out.println(repo.showContracts());
    }
}
