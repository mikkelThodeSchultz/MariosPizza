package com.company;

public class UserInterface {
    PizzaMenu pizzaMenu = new PizzaMenu();

    public String welcomeMessage(){
        return """

                Press ´1´ for something osv.\s
                Press ´2´ for something else
                Press ´3´ for a third option
                Press ´4´ for the final countdown""";
    }
    public void showMenu(){
    }

}
