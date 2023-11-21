package abstractFactoryPattern.factories.concretes;

import abstractFactoryPattern.entities.abstracts.IGpu;
import abstractFactoryPattern.entities.abstracts.IMonitor;
import abstractFactoryPattern.entities.concretes.MsiGpu;
import abstractFactoryPattern.entities.concretes.MsiMonitor;
import abstractFactoryPattern.factories.abstracts.Company;

public class MsiManufacturer extends Company {
    @Override
    public IGpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public IMonitor createMonitor() {
        return new MsiMonitor();
    }
}
