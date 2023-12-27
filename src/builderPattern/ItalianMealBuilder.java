package builderPattern;

public class ItalianMealBuilder implements MealBuilder{
    private final Meal meal;
    public ItalianMealBuilder() {
        meal = new Meal();
    }
    @Override
    public MealBuilder buildMainCourse() {
        meal.setMainCourse("Pizza");
        return this;
    }

    @Override
    public MealBuilder buildDrink() {
        meal.setDrink("Red Wine");
        return this;
    }

    @Override
    public MealBuilder buildSide() {
        meal.setSide("Garlic Bread");
        return this;
    }

    @Override
    public MealBuilder buildDessert() {
        meal.setDessert("Tiramisu");
        return this;
    }

    @Override
    public MealBuilder buildSalad() {
        meal.setSalad("Caesar Salad");
        return this;
    }

    @Override
    public Meal getMeal() {
        return null;
    }
}
