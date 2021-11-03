package com.company;


import java.util.Scanner;

public class UserInterface {

    public String welcomeMessage(){
        return """

                Press ´1´ to show menu.
                Press ´2´ create new order.
                Press ´3´ for a third option.
                Press ´0´ to quit the program.""";
    }
    public void showMenu(String string){
        System.out.println(string);
    }
    public void createOrder(String string){
        System.out.println(string);
        System.out.println("Pick the pizza you want");

    }





    public Pizza targetPizza (Scanner scanner){
        System.out.println("Write the number of the pizza: ");
        int pizzaNumber = scanner.nextInt();
        System.out.println("Write the name of the pizza: ");
        String pizzaName = scanner.nextLine();
        System.out.println("Write the ingredients for the pizza: ");
        String pizzaIngredients = scanner.nextLine();
        System.out.println("Write the price of the pizza: ");
        int pizzaPrice = scanner.nextInt();
        return new Pizza(pizzaNumber, pizzaName, pizzaIngredients, pizzaPrice);
    }
}
