package adapter.main;

import adapter.clase.bar.ISoftBar;
import adapter.clase.bar.SoftBar;
import adapter.clase.bucatarie.AdapterObiecteRestaurant;
import adapter.clase.bucatarie.AdapterRestaurant;
import adapter.clase.bucatarie.Bucatarie;
import adapter.clase.bucatarie.ISoftBucatarie;

//restaurant ex 5
public class Main {

    public static void imprimare(ISoftBucatarie bucatarie, double valoare) {
        bucatarie.printeazaNota(valoare);
    }

    public static void main(String[] args) {
        ISoftBar bar = new SoftBar("bar1");
//        bar.printezaNotaBauturi(240);

        ISoftBucatarie bucatarie = new Bucatarie("Alfredo");
//        bucatarie.printeazaNota(300);

        //eroare. pentru asta avem adapter
//        Main.imprimare(bar,300);
//        Main.imprimare(bucatarie, 500);
//
//        AdapterRestaurant adapterRestaurant = new AdapterRestaurant("bar1");
//        Main.imprimare(adapterRestaurant, 369);

        AdapterObiecteRestaurant adapterObiecteRestaurant = new AdapterObiecteRestaurant(bar);
        Main.imprimare(adapterObiecteRestaurant, 250);
    }
}
