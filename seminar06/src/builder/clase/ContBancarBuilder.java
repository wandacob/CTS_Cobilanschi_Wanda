package builder.clase;

public class ContBancarBuilder implements IBuilder {
    private boolean primesteSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;
    private String numeClient;

    public ContBancarBuilder(){
        this.primesteSalariu=false;
        this.cardAtasat=false;
        this.internetBanking=false;
        this.numeClient="Anonim";
    }

    public ContBancarBuilder setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
        return this;
    }

    public ContBancarBuilder setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    public ContBancarBuilder setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    public ContBancarBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public ContBancar build(){
        ContBancar cont = new ContBancar(this.primesteSalariu, this.cardAtasat,this.internetBanking,this.numeClient);
        return cont;
    }
}
