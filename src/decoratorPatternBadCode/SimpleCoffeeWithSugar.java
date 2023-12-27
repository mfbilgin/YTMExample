package decoratorPatternBadCode;

public class SimpleCoffeeWithSugar implements Coffee{
    @Override
    public double getCost() {
        return 1.2;
    }

    @Override
    public String getIngredients() {
        return "Kahve, Su, Şeker";
    }
}
