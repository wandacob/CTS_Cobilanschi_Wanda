package singletonRegistry;

import java.util.HashMap;
import java.util.Map;

public class InstitutiePublica {

    private String denumire;
    private int numarAngajati;
    private static Map<String,InstitutiePublica> registruInstitutii=new HashMap<>();//pt dependence inversion initializam abstract(map) si declaram concret(hashmap)

    private InstitutiePublica(String denumire, int numarAngajati) {
        this.denumire = denumire;
        this.numarAngajati = numarAngajati;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }


    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public synchronized static InstitutiePublica getInstitutie(String denumire){
        if(registruInstitutii.containsKey(denumire)){
            return registruInstitutii.get(denumire);
        }
        else {
            InstitutiePublica institutiePublica = new InstitutiePublica(denumire,0);
            registruInstitutii.put(denumire,institutiePublica);
            return institutiePublica;
        }
    }

    public synchronized static InstitutiePublica getInstitutieOptimizat(String denumire){
        if(!registruInstitutii.containsKey(denumire)){
            registruInstitutii.put(denumire, new InstitutiePublica(denumire,0));
        }
        return registruInstitutii.get(denumire);
    }

    @Override
    public String toString() {
        return "InstitutiePublica{" +
                "denumire='" + denumire + '\'' +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}
