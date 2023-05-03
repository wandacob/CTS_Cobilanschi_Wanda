package composite.clasa;

public class Filiala implements UnitateBancara {
    private String denumire;
    private int numarAngajati;

    public Filiala(String denumire, int numarAngajati) {
        this.denumire = denumire;
        this.numarAngajati = numarAngajati;
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();

    }

    @Override
    public UnitateBancara getUnitate(int index) {
        throw new RuntimeException();
    }

    @Override
    public void descriere(String identare) {
        System.out.println(identare + "Filiala " + this.denumire + " are " + this.numarAngajati + " angajati.");
    }
}