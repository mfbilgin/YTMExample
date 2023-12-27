package decoratorPattern;

public class MilkDecorator extends CoffeeDecorator {
        public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Süt";
    }
}
