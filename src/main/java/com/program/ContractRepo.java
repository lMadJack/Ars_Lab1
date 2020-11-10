package com.program;

import com.program.Entities.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class ContractRepo {
    MyList contracts = new MyList();
    Client mockClient = new Client(1, "Arseniy", LocalDate.of(1998,3,18), "м", "0000121212");

    /**
     * Method that returns array of all existing contracts
     */
    public void getContracts() {
        contracts.getAll();
    }
    /**
     * Method that returns array of all existing contracts
     */
    public void showContracts() {
        Object[] contract = contracts.getAll();
        for (int i = 0; i < contracts.getAll().length; i++) {
            if (contract[i] != null)
            System.out.println(contract[i]);
        }
    }
    /**
     * Method that returns object contract by its ID
     * @param index Index of contract.
     * @return returns contract
     */
    public Contract getContractsById(int index) {
        return (Contract)contracts.get(index);
    }
    /**
     * Method that adds contract to the array
     * @param a Object of contract.
     */
    public void addContract(Contract a) {
        contracts.add(a);
    }
    /**
     * Method that deletes contract from array by its ID
     * @param index Index of contract.
     */
    public void delContract(int index) {
        contracts.del(index);
    }
    /**
     * Method that fills array of InternetContracts with "mock-objects"
     */
    public void populateIC() {
        for (int i = 0; i < 10; i++) {
            InternetContract contract = new InternetContract(i,LocalDate.now(), LocalDate.now().plusMonths(1), mockClient,1000+i);
            contracts.add(contract);
        }
    }
    /**
     * Method that fills array of TVContracts with "mock-objects"
     */
    public void populateTVC() {
        for (int i = 10; i < 20; i++) {
            TVContract contract = new TVContract(i,LocalDate.now(), LocalDate.now().plusMonths(1), mockClient,"Pack"+i);
            contracts.add(contract);
        }
    }
    /**
     * Method that fills array of PhoneContracts with "mock-objects"
     */
    public void populatePC() {
        for (int i = 20; i < 30; i++) {
            PhoneContract contract = new PhoneContract(i,LocalDate.now(), LocalDate.now().plusMonths(1), mockClient, i+5, i+3, i+4);
            contracts.add(contract);
        }
    }

}
