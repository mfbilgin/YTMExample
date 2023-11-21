package abstractFactoryPattern.entities.concretes;

import abstractFactoryPattern.entities.abstracts.IGpu;

public class AsusGpu implements IGpu {
    @Override
    public void assemble() {
        System.out.println("Assembling Asus GPU...");
    }
}
