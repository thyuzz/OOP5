package org.example.service;

public interface MethodsAnimal {
    public default String makeNoise() {
        return "*молчание*";
    }

    public default String eat(){
        return "корм";
    };

    public default String getDescription(){
        return null;
    };
}
