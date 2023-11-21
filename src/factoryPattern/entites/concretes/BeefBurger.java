package factoryPattern.entites.concretes;

import factoryPattern.entites.abstracts.IBurger;

public class BeefBurger implements IBurger {

    @Override
    public void prepare() {
        System.out.println("Preparing beef burger...");
    }
}
