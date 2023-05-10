package template.model;

public abstract class IMasa {

    private int nr;

    public IMasa(int nr){
        this.nr=nr;
    }

    protected abstract void curataMasa();//protected ca sa nu poata fi apelate din main in alta ordine
    protected abstract void aseazaServetele();
    protected abstract void aseazaTacamuri();
    protected abstract void invitaPersoane();
    public final void ocupaMasa(){
        curataMasa();
        aseazaServetele();
        aseazaTacamuri();
        invitaPersoane();
    }

    public int getNr(){
        return this.nr;
    }
}
