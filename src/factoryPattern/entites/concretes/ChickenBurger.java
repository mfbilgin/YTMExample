package factoryPattern.entites.concretes;

import factoryPattern.entites.abstracts.IBurger;

public class ChickenBurger implements IBurger {
    @Override
    public void prepare() {
        System.out.println("Preparing chicken burger...");
    }
}
