package Decorator;

public class Farmhouse implements PizzaConstituents {

    private PizzaConstituents pizzaConstituents;

    public Farmhouse()
    {

    }

    public Farmhouse(PizzaConstituents pizzaConstituents)
    {
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getCost() {
        if(pizzaConstituents!=null) {
            return pizzaConstituents.getCost() + 150;
        }
        return 150;
    }

    @Override
    public String getDescription() {
        if(pizzaConstituents!=null) {
            return pizzaConstituents.getDescription() + " + Farmhouse";
        }
        return "Farmhouse";
    }

}
