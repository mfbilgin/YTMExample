package abstractFactoryPattern.entities.concretes;

import abstractFactoryPattern.entities.abstracts.IMonitor;

public class AsusMonitor implements IMonitor {
    @Override
    public void assemble() {
        System.out.println("Assembling Asus Monitor...");
    }
}
