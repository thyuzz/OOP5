package org.example.model;

import org.example.service.Methods;
import org.example.service.MethodsImpl;

public class Person extends MethodsImpl implements Methods {
    protected String name;
    protected int wallet;

    public Person(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }


}
