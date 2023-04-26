package spital.facade.clase;

public class Pacient {
    private String nume;
    private int gravitate;

    public Pacient (String nume, int gravitate) {
        this.nume = nume;
        this.gravitate = gravitate;
    }

    public Pacient () {
        this.nume = "";
        this.gravitate = 0;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getGravitate() {
        return gravitate;
    }

    public void setGravitate(int gravitate) {
        this.gravitate = gravitate;
    }
}
