package builderPattern;

public class Meal{
    private String mainCourse;
    private String drink;
    private String side;
    private String dessert;
    private String salad;

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mainCourse='" + mainCourse + '\'' +
                ", drink='" + drink + '\'' +
                ", side='" + side + '\'' +
                ", dessert='" + dessert + '\'' +
                ", salad='" + salad + '\'' +
                '}';
    }


}