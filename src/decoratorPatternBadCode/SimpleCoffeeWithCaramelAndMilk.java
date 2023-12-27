package decoratorPatternBadCode;

public class SimpleCoffeeWithCaramelAndMilk implements Coffee{
    @Override
    public double getCost() {
        return 3.5;
    }

    @Override
    public String getIngredients() {
        return "Kahve , Su , Karamel , Süt";
    }

}
