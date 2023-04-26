package factory_method.main;

import factory_method.FactoryAsistent;
import factory_method.FactoryBrancardier;
import factory_method.FactoryMedic;
import factory_method.PersonalSpital;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactoryMedic factoryMedic = new FactoryMedic();
        FactoryBrancardier factoryBrancardier = new FactoryBrancardier();
        FactoryAsistent factoryAsistent = new FactoryAsistent();

        List<PersonalSpital> listaPersonal = new ArrayList<>();

        listaPersonal.add(factoryMedic.createPersonal("Ciprian"));
        listaPersonal.add(factoryMedic.createPersonal("John"));
        listaPersonal.add(factoryBrancardier.createPersonal("Gigi"));

        for(PersonalSpital personalSpital : listaPersonal){
            personalSpital.afiseazaDescriere();
        }
    }
}
