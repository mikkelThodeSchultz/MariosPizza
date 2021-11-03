package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

Scanner sc = new Scanner(System.in);
UserInterface ui = new UserInterface();
PizzaMenu pizzaMenu = new PizzaMenu();
FileManager fileManager = new FileManager();


boolean goAgain = true;

    public Application() throws FileNotFoundException {
    }

    public void start() {
        pizzaMenu.addPizzaToList();


        while (goAgain){

            System.out.println(ui.welcomeMessage());
            int command = sc.nextInt();
            sc.nextLine();
            switch (command){
                case 1:
                    showMenu();
                    break;
                case 2:
                    createOrder();
                    break;
                case 3:
                    showOrderList();
                    break;
                case 0:
                    try {
                        fileManager.saveToFile(pizzaMenu);
                    } catch (FileNotFoundException e) {
                        System.out.println("File not found");
                    }
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
        ui.showMenu(pizzaMenu.showMenu(pizzaMenu));
    }
    public void showOrderList(){

    }
    public void saveFiles(){

    }
}