package com.company;

import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {

    private ArrayList<Pizza> pizzaListe = new ArrayList<>();

    Pizza vesuvio = new Pizza(1, "Vesuvio", "tomatsauce, ost, skinke og oregano", 57);
    Pizza amerikaner = new Pizza(2, "Amerikaner", "tomatsauce, ost, oksefars og oregano", 53);
    Pizza cacciatore = new Pizza(3, "Cacciatore", "tomatsauce, ost, pepperoni og oregano", 57);
    Pizza cabonara = new Pizza(4, "Cabonara", "tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano", 63);
    Pizza dennis = new Pizza(5, "Dennis", "tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano", 65);
    Pizza bertil = new Pizza(6, "Bertil", "tomatsauce, ost, bacon og oregano", 57);
    Pizza silvia = new Pizza(7, "Silvia", "tomatsauce, ost, pepperoni, rød pepper, løg, oliven og oregano", 61);
    Pizza victoria = new Pizza(8, "Victoria", "tomatsauce, ost, skinke, ananas, champignon, løg og oregano", 61);
    Pizza toronfo = new Pizza(9, "Toronfo", "tomatsauce, ost, skinke, bacon, kebab, chili og oregano", 61);
    Pizza capricciosa = new Pizza(10, "Capricciosa", "tomatsauce, ost, skinke, champignon og oregano", 61);
    Pizza hawai = new Pizza(11, "Hawai", "tomatsauce, ost, skinke, ananas og oregano", 61);
    Pizza leBlisola = new Pizza(12, "Le Blisola", "tomatsauce, ost, skinke, rejer og oregano", 61);
    Pizza venezia = new Pizza(13, "Venezia", "tomatsauce, ost, skinke, bacon og oregano", 61);
    Pizza mafia = new Pizza(14, "Mafia", "tomatsauce, ost, pepperoni, bacon, løg og oregano", 61);


    public void addPizzaToList() {
        pizzaListe.addAll(List.of(vesuvio, amerikaner, cacciatore, cabonara, dennis, bertil, silvia, victoria, toronfo, capricciosa, hawai, leBlisola, venezia, mafia));
    }

    public ArrayList<Pizza> getPizzaListe() {
        return pizzaListe;
    }

    public String showMenu(PizzaMenu pizzaMenu) {
        String temp = "";
        for (int i = 0; i < pizzaMenu.getPizzaListe().size(); i++) {
            temp += pizzaMenu.getPizzaListe().get(i);
        }
        return temp;
    }

}



