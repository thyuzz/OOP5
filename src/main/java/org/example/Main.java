package org.example;

import org.example.model.Buyer;
import org.example.model.Cat;
import org.example.model.Dog;
import org.example.model.Seller;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Seller seller = new Seller("John", 10000);
        Buyer buyer = new Buyer("Buyer", 5000);

        Cat Jenny = new Cat("Jenny", 2, "вислоухая британская", 2500);
        Cat Witty = new Cat("Witty", 2, "сибирская", 2000);

        Dog Rem = new Dog("Rem", 3, "хаски", 3500);
        Dog Milly = new Dog("Milly", 2, "такса", 3000);

        buyer.sellbuy(seller, buyer, Jenny.getPrice());
        buyer.sellbuy(seller, buyer, Milly.getPrice());
        System.out.println(buyer.getWallet());

    }
}