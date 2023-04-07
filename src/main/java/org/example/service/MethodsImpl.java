package org.example.service;

import org.example.model.Person;

public class MethodsImpl implements Methods  {


    @Override
    public void sellbuy(Seller seller, Buyer buyer, int price){
        if (buyer.getWallet() >= price){
            seller.setWallet(seller.getWallet() + price);
            buyer.setWallet(buyer.getWallet() - price);
            System.out.println("Сделка совершена успешно.");
        }else {
            System.out.println("У покупателя не хватает средств.");
        }
    };



}
