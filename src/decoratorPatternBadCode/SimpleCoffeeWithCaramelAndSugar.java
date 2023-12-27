package decoratorPatternBadCode;

public class SimpleCoffeeWithCaramelAndSugar implements Coffee{
@Override
    public double getCost() {
        return 3.2;
    }

    @Override
    public String getIngredients() {
        return "Kahve , Su , Karamel , Şeker";
    }
}
