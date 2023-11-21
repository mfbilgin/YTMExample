package factoryPattern.entites.concretes;
import factoryPattern.entites.abstracts.IBurger;

public class VeggieBurger implements IBurger {
    @Override
    public void prepare() {
        System.out.println("Preparing veggie burger...");
    }
}
