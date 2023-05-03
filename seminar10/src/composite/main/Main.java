package composite.main;

import composite.clasa.Filiala;
import composite.clasa.Sucursala;
import composite.clasa.UnitateBancara;

public class Main {
    public static void main(String[] args) {
        UnitateBancara sucursala1 = new Sucursala("Sucursala1", 10);
        UnitateBancara sucursala2 = new Sucursala("Sucursala2", 3);
        UnitateBancara agentie1 = new Sucursala("Agentie1", 12);
        UnitateBancara agentie2 = new Sucursala("Agentie2", 2);

        UnitateBancara filiala1 = new Filiala("filiala1",12);
        UnitateBancara filiala2 = new Filiala("filiala2",13);
        UnitateBancara filiala3 = new Filiala("filiala3", 15);

        sucursala1.adaugaUnitate(sucursala2);
        sucursala1.adaugaUnitate(agentie1);
        sucursala1.adaugaUnitate(filiala1);

        sucursala2.adaugaUnitate(agentie2);
        sucursala2.adaugaUnitate(filiala2);

        agentie1.adaugaUnitate(filiala3);

        sucursala1.descriere("");
    }
}