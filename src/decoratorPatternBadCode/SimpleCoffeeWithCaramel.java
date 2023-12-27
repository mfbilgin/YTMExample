package decoratorPatternBadCode;

public class SimpleCoffeeWithCaramel implements Coffee{
    @Override
    public double getCost() {
        return 3;
    }

    @Override
    public String getIngredients() {
        return "Kahve , Su , Karamel";
    }
}
