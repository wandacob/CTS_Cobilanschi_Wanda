package adapter.clase.bucatarie;

import adapter.clase.bar.ISoftBar;
import adapter.clase.bar.SoftBar;

public class AdapterObiecteRestaurant implements ISoftBucatarie {
    private ISoftBar softBar;

    public AdapterObiecteRestaurant(ISoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaNota(double totalPlata) {
        this.softBar.printezaNotaBauturi(totalPlata);
    }
}
