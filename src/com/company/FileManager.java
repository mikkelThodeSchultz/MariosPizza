package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

    File file = new File("data/pizzamenu.csv");
        private ArrayList<Pizza> pizzaMenu = new ArrayList<>();
        Scanner scanner = new Scanner(file);

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

}
