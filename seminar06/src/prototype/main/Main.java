package prototype.main;

import prototype.models.ContBancar;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> documente = new HashMap<>();
        documente.put("CI",2);
        documente.put("Adeverinta munca",6);

        ContBancar contBancar = new ContBancar("Andrei",documente,8);
        ContBancar contBancarCopie = (ContBancar) contBancar.cloneaza();

        System.out.println(contBancar==contBancarCopie);
        System.out.println(contBancar);
        System.out.println(contBancarCopie);
    }
}
