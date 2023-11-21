package abstractFactoryPattern.entities.concretes;

import abstractFactoryPattern.entities.abstracts.IGpu;

public class MsiGpu implements IGpu {
    @Override
    public void assemble() {
        System.out.println("Assembling Msi GPU...");
    }
}
