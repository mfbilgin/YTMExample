package decoratorPatternBadCode;

public class SimpleCoffeeWithCaramelAndMilkAndSugar implements Coffee{
    @Override
    public double getCost() {
        return 3.7;
    }

    @Override
    public String getIngredients() {
        return "Kahve , Su , Karamel , Süt , Şeker";
    }
}
