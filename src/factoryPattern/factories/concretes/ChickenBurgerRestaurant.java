package factoryPattern.factories.concretes;

import factoryPattern.factories.abstracts.Restaurant;
import factoryPattern.entites.abstracts.IBurger;
import factoryPattern.entites.concretes.ChickenBurger;

public class ChickenBurgerRestaurant extends Restaurant {
    @Override
    public IBurger createBurger() {
        return new ChickenBurger();
    }
}
