package com.company;


public class Pizza {

    int number;
    String name;
    String ingredients;
    int price;

    public Pizza (int number, String name, String ingredients, int price){
        this.number = number;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    @Override
    public String toString() {

        return  number + ". " + name + ": " + ingredients + "..." + price + ",-\n";

    }
}
