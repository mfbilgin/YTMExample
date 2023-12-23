package observerPattern;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Iphone 12",0);
        Product product2 = new Product("Mac Book Pro",0);
        UserObserver userObserver = new UserObserver("user@domain.com");
        UserObserver userObserver2 = new UserObserver("user2@domain.com");
        product.attach(userObserver);
        product.attach(userObserver2);
        product2.attach(userObserver2);
        product.detach(userObserver2);
        product2.updateStock(50);
    }
}
