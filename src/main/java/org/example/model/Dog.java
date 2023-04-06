package org.example.model;

public class Dog extends Animal{
    String genus;

    public Dog(String name, int age, String genus, int price) {
        super(name, age, price);
        this.genus = genus;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "genus='" + genus + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }

    @Override
    public String makeNoise() {
        return "гав-гав";
    }
    @Override
    public String eat(){
        return "Псы и собаки едят корма, мясо разных животных, и " +
                "растительные продукты";
    };

    @Override
    public String getDescription(){
        return "собака — плацентарное млекопитающее отряда хищных семейства псовых.";
    };
}
