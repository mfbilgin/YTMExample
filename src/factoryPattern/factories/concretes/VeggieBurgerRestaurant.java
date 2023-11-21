package factoryPattern.factories.concretes;
import factoryPattern.factories.abstracts.Restaurant;
import factoryPattern.entites.abstracts.IBurger;
import factoryPattern.entites.concretes.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public IBurger createBurger() {
        return new VeggieBurger();
    }
}
