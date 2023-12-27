package decoratorPattern;

public class CaramelDecorator extends CoffeeDecorator{
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Karamel";
    }
}
