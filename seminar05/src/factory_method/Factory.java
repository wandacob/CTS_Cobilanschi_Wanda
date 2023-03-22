package factory_method;

import factory_method.PersonalSpital;

public interface Factory {
    public PersonalSpital createPersonal(String name);
}
