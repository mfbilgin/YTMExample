package factoryPattern.factories.concretes;
import factoryPattern.factories.abstracts.Restaurant;
import factoryPattern.entites.abstracts.IBurger;
import factoryPattern.entites.concretes.BeefBurger;
public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public IBurger createBurger() {
        return new BeefBurger();
    }
}
