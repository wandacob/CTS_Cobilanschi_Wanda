package template.main;

import template.model.IMasa;
import template.model.Masa;
import template.model.MasaRezervata;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(1);
        masa.ocupaMasa();

        IMasa masaRezervata = new MasaRezervata(2,"14:30");
        masaRezervata.ocupaMasa();
    }
}
