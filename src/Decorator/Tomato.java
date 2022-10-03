package Decorator;

public class Tomato implements PizzaConstituents{

    private PizzaConstituents pizzaConstituents;

    public Tomato(PizzaConstituents pizzaConstituents)
    {
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getCost() {
        return pizzaConstituents.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return pizzaConstituents.getDescription() + " + Tomato";
    }
}
