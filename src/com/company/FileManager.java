package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    int orderCounter = 0;
    File file = new File("data/pizzamenu.csv");
    private ArrayList<Pizza> pizzaMenu = new ArrayList<>();


    public FileManager() throws FileNotFoundException {
        pizzaMenu = new ArrayList<>();

    }

    public void saveToFile(PizzaMenu pizzaMenu) throws FileNotFoundException {
        // lav en ny fil
        //loop igennem
        //skriv hver beer til filen

        File file = new File("data/pizzamenu.csv");

        PrintStream ps = new PrintStream(file);

        for (Pizza pizza : pizzaMenu.getPizzaListe()) {
            ps.println(pizza.toCSVString());
        }

    }

    public String readPizzaMenu() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String temp = "";
        while (scanner.hasNextLine()) {
            String lineOfText = scanner.nextLine();
            temp += lineOfText.replace(";", " - ") + ",-\n";
        }
        return temp;
    }

    public void createPizzaFromFile() throws FileNotFoundException {
        Scanner scannerNumber = new Scanner(System.in);
        String pizzaTemp = "";
        boolean goAgain = true;
        orderCounter++;
        while (goAgain) {
            Scanner scanner = new Scanner(file);
            System.out.println("Kom med et nummer");
            String number = scannerNumber.nextLine();
            while (scanner.hasNextLine()) {
                pizzaTemp = scanner.nextLine();
                String[] s = pizzaTemp.split(";");
                if (s[0].equals(number)) {
                    File file = new File("Data/order.csv");
                    PrintStream ps = new PrintStream(new FileOutputStream(file, true));
                    ps.append(pizzaTemp + "; order# " + orderCounter + "\n");
                }
            }
            if (number.equals("0")) {
                goAgain = false;
            }
        }
    }
}
