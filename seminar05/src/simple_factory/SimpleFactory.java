package simple_factory;

public class SimpleFactory {
    public PersonalSpital createPersonal(TipPersonal tipPersonal, String name){
        switch (tipPersonal){
            case Medic: return new Medic(name);//nu mai trb TipPersonal.Medic pt ca switch vede ce valori poate avea
            case Brancardier: return new Brancardier(name);
            case Asistent: return new Asistent(name);
            default:return null;
        }
    }
    public PersonalSpital createPersonal(TipPersonal tipPersonal, String name, int aniVechime){
        switch (tipPersonal){
            case Anestezist: return new Anestezist(name,aniVechime);
            default: return createPersonal(tipPersonal,name);
        }
    }
}
