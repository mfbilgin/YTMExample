package builderPattern;

public class MealBuilder implements IMealBuilder {
    private final Meal meal;
    public MealBuilder() {
        meal = new Meal();
    }

    @Override
    public IMealBuilder buildMainCourse(String mainCourse) {
        meal.setMainCourse(mainCourse);
        return this;
    }

    @Override
    public IMealBuilder buildDrink(String drink) {
        meal.setDrink(drink);
        return this;
    }

    @Override
    public IMealBuilder buildDessert(String dessert) {
        meal.setDessert(dessert);
        return this;
    }

    @Override
    public IMealBuilder buildSide(String side) {
        meal.setSide(side);
        return this;
    }

    @Override
    public IMealBuilder buildSalad(String salad) {
        meal.setSalad(salad);
        return this;

    }

    @Override
    public Meal build() {
        return meal;
    }
}
