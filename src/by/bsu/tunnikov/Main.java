package by.bsu.tunnikov;

import by.bsu.tunnikov.ship.Tanker;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Tanker pobeda = new Tanker(165868, 5000, 150, 721);
        System.out.println("Танкер атаковали!!! \nСрочно все по шлюпкам!");
        pobeda.launchingBoats();
        pobeda.sailingBoats();
    }

}