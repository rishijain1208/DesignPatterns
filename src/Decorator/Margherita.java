package Decorator;

public class Margherita implements PizzaConstituents{

    private PizzaConstituents pizzaConstituents;

    public Margherita()
    {

    }

    public Margherita(PizzaConstituents pizzaConstituents)
    {
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getCost() {
        if(pizzaConstituents!=null) {
            return pizzaConstituents.getCost() + 200;
        }
        return 200;
    }

    @Override
    public String getDescription() {
        if(pizzaConstituents!=null) {
            return pizzaConstituents.getDescription() + " + Margherita";
        }
        return "Margherita";
    }

}
