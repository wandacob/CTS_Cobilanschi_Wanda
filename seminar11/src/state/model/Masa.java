package state.model;

public class Masa {
    private int numar;
    private IStare stare;

    public Masa(int nr) {
        this.numar = nr;
        stare=new StareLibera();
    }

    protected void setStare(IStare s) {//nu trb sa poata fi apelata si schimbata starea din main, doar din clase
        this.stare = s;
    }

    protected IStare getStare() {//nu trb sa poata fi apelata si schimbata starea din main, doar din clase
        return this.stare;
    }

    public void ocupareMasa(){
        IStare stare = new StareOcupata();
        stare.modificaStarea(this);
    }

    public void rezervaMasa(){
        IStare stare = new StareRezervata();
        stare.modificaStarea(this);
    }

    public void elibereazaMasa(){
        IStare stare = new StareLibera();
        stare.modificaStarea(this);
    }
}
