package builderPattern;

public interface IMealBuilder {
    IMealBuilder buildMainCourse(String mainCourse);
    IMealBuilder buildDrink(String drink);
    IMealBuilder buildDessert(String dessert);
    IMealBuilder buildSide(String side);
    IMealBuilder buildSalad(String salad);
    Meal build();
}