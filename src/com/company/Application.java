package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Application {

    Scanner sc = new Scanner(System.in);
    UserInterface ui = new UserInterface();
    PizzaMenu pizzaMenu = new PizzaMenu();
    FileManager fileManager = new FileManager();


    boolean goAgain = true;

    public Application() throws FileNotFoundException {
    }

    public void start() throws FileNotFoundException {
        pizzaMenu.addPizzaToList();


        while (goAgain) {

            System.out.println(ui.welcomeMessage());
            int command = sc.nextInt();
            sc.nextLine();
            switch (command) {
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
                        System.out.println("Pizzamenu has been saved.");
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

    public void createOrder() throws FileNotFoundException {
        ui.createOrder(fileManager.readPizzaMenu());
        fileManager.createPizzaFromFile();



    }

    public void showMenu() throws FileNotFoundException {
        ui.showMenu(fileManager.readPizzaMenu());
        // ui.showMenu(pizzaMenu.showMenu(pizzaMenu));
    }

    public void showOrderList() {

    }

    public void saveFiles() {

    }

    public void targetPizza(Scanner scanner) {
        pizzaMenu.addNewPizzaToList(ui.targetPizza(scanner));

    }
}