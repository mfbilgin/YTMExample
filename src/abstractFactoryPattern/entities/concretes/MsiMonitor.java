package abstractFactoryPattern.entities.concretes;

import abstractFactoryPattern.entities.abstracts.IMonitor;

public class MsiMonitor implements IMonitor {
    @Override
    public void assemble() {
        System.out.println("Assembling Msi Monitor...");
    }
}
