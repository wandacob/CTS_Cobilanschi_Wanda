package factory_method;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere(){
        System.out.println("Brancardierul "+ super.getName());//super.getName pt ca e cleancode
    }
}
