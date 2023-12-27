package builderPattern;

public interface MealBuilder{
    MealBuilder buildMainCourse();
    MealBuilder buildDrink();
    MealBuilder buildSide();
    MealBuilder buildDessert();
    MealBuilder buildSalad();
    Meal getMeal();
}