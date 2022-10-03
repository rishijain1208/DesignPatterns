package Decorator;

public class BBQChicken implements PizzaConstituents {

    private PizzaConstituents pizzaConstituents;

    public BBQChicken()
    {

    }

    public BBQChicken(PizzaConstituents pizzaConstituents)
    {
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getCost() {
        if(pizzaConstituents!=null)
        {
            return pizzaConstituents.getCost() + 200;
        }
        return 200;
    }

    @Override
    public String getDescription() {
        if(pizzaConstituents!=null)
        {
            return pizzaConstituents.getDescription() + " + BBQChicken";
        }
        return "BBQChicken";
    }

}
