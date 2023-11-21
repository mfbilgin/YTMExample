package observerPattern;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Iphone 12");
        Product product2 = new Product("Mac Book Pro");
        UserObserver userObserver = new UserObserver("user@domain.com");
        UserObserver userObserver2 = new UserObserver("user2@domain.com");
        product.attach(userObserver);
        product2.attach(userObserver2);
        product2.updateStock(50);
    }
}
