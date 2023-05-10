package observer.main;

import observer.model.Client;
import observer.model.IClient;
import observer.model.IRestaurant;
import observer.model.Restaurant;

public class Main {
    public static void main(String[] args) {
        IClient client1 = new Client("George");
        IClient client2 = new Client("Alina");
        IClient client3 = new Client("Marin");

        Restaurant restaurant = new Restaurant("Derby Restaurant");//facem Restaurant nu IRestaurant ca sa avem acces si la cele 2 alte functionalitati chiar daca incalcam dependence inversion (poate vreau restaurant cu terasa)

        restaurant.introduceOfertaNoua();
        restaurant.abonareClient(client1);
        restaurant.adaugaDiscount(25);
        restaurant.abonareClient(client2);
        restaurant.abonareClient(client3);
        restaurant.dezabonareClient(client1);
        restaurant.introduceOfertaNoua();
    }
}
