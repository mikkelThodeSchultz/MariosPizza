package com.company;

import java.util.Scanner;

public class Application {
Scanner sc = new Scanner(System.in);
UserInterface ui = new UserInterface();
PizzaMenu pizzaMenu = new PizzaMenu();
boolean goAgain = true;

    public void start() {
        pizzaMenu.pizzaList();

        while (goAgain){

            System.out.println(ui.welcomeMessage());
            int command = sc.nextInt();
            sc.nextLine();
            switch (command){
                case 1:
                    showMenu();
                    System.out.println(pizzaMenu);
                    break;
                case 2:
                    createOrder();
                    break;
                case 3:
                    showOrderList();
                    break;
                case 4:
                    saveFiles();
                    goAgain = false;
                    break;
                default:
                    System.out.println("Wrong input yo");

            }
        }
    }

    public void createOrder(){

    }
    public void showMenu(){
        ui.showMenu();

    }
    public void showOrderList(){

    }
    public void saveFiles(){

    }
}