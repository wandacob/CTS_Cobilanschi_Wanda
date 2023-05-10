package template.model;

public class Masa extends IMasa {
    public Masa(int nr) {
        super(nr);
    }

    @Override
    protected void curataMasa() {
        System.out.println("Am curatat masa "+super.getNr());
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Am asezat servetelele la masa "+super.getNr());
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Am asezat tacamuri la masa "+super.getNr());
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Am invitat persoane la masa "+super.getNr());
    }
}
