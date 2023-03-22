package factory_method;

import factory_method.PersonalSpital;

public class FactoryBrancardier implements Factory{
    @Override
    public PersonalSpital createPersonal(String name) {
        return new Brancardier(name);
    }
}
