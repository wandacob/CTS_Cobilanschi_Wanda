package template.model;

public class MasaRezervata extends IMasa{
    String oraRezervare;
    public MasaRezervata(int nr, String oraRezervare) {
        super(nr);
        this.oraRezervare = oraRezervare;
    }

    @Override
    protected void curataMasa() {
        System.out.println("Masa "+super.getNr()+" a fost curatata inainte de ora "+this.oraRezervare);
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Masa "+super.getNr()+" au fost asezate servetelele inainte de ora "+this.oraRezervare);
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Masa "+super.getNr()+" au fost asezate tacamurile inainte de ora "+this.oraRezervare);
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Masa "+super.getNr()+" au fost invitate persoanele inainte de ora "+this.oraRezervare);
    }
}
