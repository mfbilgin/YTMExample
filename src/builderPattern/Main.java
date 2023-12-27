package builderPattern;

public class Main {
    public static void main(String[] args) {
        // Create a new object of the class MealBuilder
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.buildMainCourse("Chicken Burger")
                .buildDessert("Chocolate Cake")
                .buildDrink("Coke")
                .build();
        System.out.println(meal);
    }
}
