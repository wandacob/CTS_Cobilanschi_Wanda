package composite.clasa;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements UnitateBancara {
    private String denumire;
    private int numarAngajati;
    private List<UnitateBancara> lista;

    public Sucursala(String denumire, int numarAngajati) {
        this.denumire = denumire;
        this.numarAngajati = numarAngajati;
        this.lista = new ArrayList<>();
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        this.lista.add(unitateBancara);
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        this.lista.remove(unitateBancara);
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        return this.lista.get(index);
    }

    @Override
    public void descriere(String identare) {
        System.out.println(identare + "Sucursala  " + this.denumire + " are " + this.numarAngajati + " angajati.");
        for (UnitateBancara unitateBancara : lista) {
            unitateBancara.descriere(identare + "   ");
        }
    }
}