package org.example.model;

public class Cat extends Animal{
    String genus;

    public Cat(String name, int age, String genus, int price) {
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
        return "Cat{" +
                "genus='" + genus + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }

    @Override
    public String makeNoise() {
        return "мяу-мяу";
    }
    @Override
    public String eat(){
        return "Коты и кошки едят корма, мясо разных животных, " +
                "растительные продукты и рыбу";
    };

    @Override
    public String getDescription(){
        return "домашняя кошка — млекопитающее семейства кошачьих отряда хищных.";
    };
}
