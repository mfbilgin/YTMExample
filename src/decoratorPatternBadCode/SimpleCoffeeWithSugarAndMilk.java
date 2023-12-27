package decoratorPatternBadCode;

public class SimpleCoffeeWithSugarAndMilk implements Coffee{
    @Override
    public double getCost() {
        return 1.7;
    }

    @Override
    public String getIngredients() {
        return "Kahve, Su, Şeker, Süt";
    }
}
