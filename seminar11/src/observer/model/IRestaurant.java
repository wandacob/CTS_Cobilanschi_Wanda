package observer.model;

public interface IRestaurant {
    void abonareClient(IClient client);
    void dezabonareClient(IClient client);
    void notificareClienti(String mesaj);
}
