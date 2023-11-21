package factoryPattern.factories.abstracts;
import factoryPattern.entites.abstracts.IBurger;

public abstract class Restaurant {
    public void orderBurger() {
        IBurger burger = createBurger();
        burger.prepare();
    }
    public abstract IBurger createBurger();
}
