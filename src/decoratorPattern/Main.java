package decoratorPattern;

public class Main {
    public static void main(String[] args) {
        // Basit kahve oluşturma
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Basit Kahve Maliyeti: " + simpleCoffee.getCost());
        System.out.println("Basit Kahve İçeriği: " + simpleCoffee.getIngredients());

        // Süt eklenmiş kahve oluşturma
        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println("Süt Eklenmiş Kahve Maliyeti: " + milkCoffee.getCost());
        System.out.println("Süt Eklenmiş Kahve İçeriği: " + milkCoffee.getIngredients());

        // Şeker eklenmiş kahve oluşturma
        Coffee sugarCoffee = new SugarDecorator(new SimpleCoffee());
        System.out.println("Şeker Eklenmiş Kahve Maliyeti: " + sugarCoffee.getCost());
        System.out.println("Şeker Eklenmiş Kahve İçeriği: " + sugarCoffee.getIngredients());

        // Süt ve şeker eklenmiş kahve oluşturma
        Coffee milkSugarCoffee = new MilkDecorator(new SugarDecorator(new SimpleCoffee()));
        System.out.println("Süt ve Şeker Eklenmiş Kahve Maliyeti: " + milkSugarCoffee.getCost());
        System.out.println("Süt ve Şeker Eklenmiş Kahve İçeriği: " + milkSugarCoffee.getIngredients());
    }
}
