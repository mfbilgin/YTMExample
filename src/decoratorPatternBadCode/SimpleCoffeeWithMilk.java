package decoratorPatternBadCode;

public class SimpleCoffeeWithMilk implements Coffee {
    @Override
    public double getCost() {
        return 1.5;
    }

    @Override
    public String getIngredients() {
        return "Kahve, Su, Süt";
    }
}