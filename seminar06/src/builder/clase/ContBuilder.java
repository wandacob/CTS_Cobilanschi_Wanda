package builder.clase;

public class ContBuilder implements IBuilder{

    ContBancar contBancar;

    public ContBuilder() {
        this.contBancar = new ContBancar(false, false, false, "Anonim");
    }

    @Override
    public IBuilder setPrimesteSalariu(boolean primesteSalariu) {
        this.contBancar.setPrimesteSalariu(primesteSalariu);
        return this;
    }

    @Override
    public IBuilder setCardAtasat(boolean cardAtasat) {
        this.contBancar.setCardAtasat(cardAtasat);
        return this;
    }

    @Override
    public IBuilder setNumeClient(String numeClient) {
        this.contBancar.setNumeClient(numeClient);
        return this;
    }

    @Override
    public IBuilder setInternetBanking(boolean internetBanking) {
        this.contBancar.setInternetBanking(internetBanking);
        return this;
    }

    @Override
    public ContBancar build(){
        return this.contBancar;
    }
}
