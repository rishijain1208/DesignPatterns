package Decorator;

import java.io.Console;

public class Client {

    public static void main(String[] args) {

        PizzaConstituents paneer = new Paneer(new Cheese(new Tomato(new BBQChicken())));

        System.out.println(paneer.getCost());
        System.out.println(paneer.getDescription());
    }
}
