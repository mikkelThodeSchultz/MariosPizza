package com.company;


public class UserInterface {

    public String welcomeMessage(){
        return """

                Press ´1´ to show menu.\s
                Press ´2´ for something else
                Press ´3´ for a third option
                Press ´4´ for the final countdown""";
    }
    public void showMenu(String string){
        System.out.println(string);
    }
}
