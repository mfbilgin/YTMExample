package decoratorPatternBadCode;

public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "Kahve, Su";
    }
}
