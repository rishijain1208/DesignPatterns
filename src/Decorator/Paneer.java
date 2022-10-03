package Decorator;

public class Paneer implements PizzaConstituents{

    private PizzaConstituents pizzaConstituents;

    public Paneer(PizzaConstituents pizzaConstituents)
    {
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getCost() {
        return pizzaConstituents.getCost() + 60;
    }

    @Override
    public String getDescription() {
        return pizzaConstituents.getDescription() + " + Paneer";
    }
}
