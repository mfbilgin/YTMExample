package abstractFactoryPattern.factories.abstracts;

import abstractFactoryPattern.entities.abstracts.IGpu;
import abstractFactoryPattern.entities.abstracts.IMonitor;

public abstract class Company {

    public abstract IGpu createGpu();
    public abstract IMonitor createMonitor();
}
