package singleton.classes;

public class Secretariat {
    private int numarBirou;
    private int numarAngajati;
    private static Secretariat instanta=null;

    private Secretariat(int numarAngajati, int numarBirou){
        this.numarAngajati=numarAngajati;
        this.numarBirou=numarBirou;
    }

    public synchronized static Secretariat getInstanta(int numarBirou, int numarAngajati){//synchronized pt ca e lazy initialization si threadsafe
        if(Secretariat.instanta==null){
            Secretariat.instanta = new Secretariat(numarBirou,numarAngajati);
        }
        return Secretariat.instanta;
    }

    @Override
    public String toString() {
        return "Secretariat{" +
                "numarBirou= " + numarBirou +
                " numarAngajati" + numarAngajati + "}";
    }
}
