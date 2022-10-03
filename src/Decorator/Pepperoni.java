package Decorator;

public class Pepperoni implements PizzaConstituents {

    private PizzaConstituents pizzaConstituents;

    public Pepperoni()
    {

    }

    public Pepperoni(PizzaConstituents pizzaConstituents)
    {
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getCost() {

        if(pizzaConstituents!=null) {
            return pizzaConstituents.getCost() + 180;
        }
        return 180;
    }

    @Override
    public String getDescription() {
        if(pizzaConstituents!=null) {
            return pizzaConstituents.getDescription() + " + Pepperoni";
        }
        return "Pepperoni";
    }
}
