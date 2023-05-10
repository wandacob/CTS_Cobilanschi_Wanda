package observer.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
    private String nume;
    private List<IClient> listaClienti;

    public Restaurant(String nume) {
        this.nume = nume;
        listaClienti = new ArrayList<>();
    }

    @Override
    public void abonareClient(IClient client) {
        this.listaClienti.add(client);
    }

    @Override
    public void dezabonareClient(IClient client) {
        this.listaClienti.remove(client);
    }

    @Override
    public void notificareClienti(String mesaj) {
        for (IClient client : this.listaClienti){
            client.primesteNotificare(mesaj);
        }
    }

    public void introduceOfertaNoua() {
        String mesaj = new String(this.nume+" a introdus o oferta noua.");
        notificareClienti(mesaj);
    }

    public void adaugaDiscount(int discount){
        String mesaj = new String(this.nume+" a introdus un discount de "+discount);
        notificareClienti(mesaj);
    }
}
