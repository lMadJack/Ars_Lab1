package com.program;

import com.program.Entities.*;


public class Main {
    /**
     * This is the main method which makes use of all populating methods and uses method to show all contracts.
     * @param args Unused.
     */
    public static void main(String[] args) {
//        Menu menu = new Menu();
//        menu.showMenu();
        ContractRepo conRepo = new ContractRepo();
        conRepo.populateIC();
        conRepo.populateTVC();
        conRepo.populatePC();
        conRepo.showContracts();
    }
}
