package com.program;

import com.program.Entities.*;

import java.util.ArrayList;

public class ContractRepo {
    MyList contracts = new MyList();
    public void showContracts() {
        contracts.getAll();
    }
    public void addContract(Object a) {
        contracts.add(a);
    }
}
