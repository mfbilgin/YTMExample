package abstractFactoryPattern.factories.concretes;

import abstractFactoryPattern.entities.abstracts.IGpu;
import abstractFactoryPattern.entities.abstracts.IMonitor;
import abstractFactoryPattern.entities.concretes.AsusGpu;
import abstractFactoryPattern.entities.concretes.AsusMonitor;
import abstractFactoryPattern.factories.abstracts.Company;

public class AsusManufacturer extends Company {
    @Override
    public IGpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public IMonitor createMonitor() {
        return new AsusMonitor();
    }
}
