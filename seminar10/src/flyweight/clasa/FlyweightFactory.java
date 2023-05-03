package flyweight.clasa;

import flyweight.clasa.Detinator;
import flyweight.clasa.IClientBanca;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, IClientBanca> mapCont;

    public FlyweightFactory() {
        this.mapCont = new HashMap<>();
    }

    public IClientBanca getDestinatar(String nume, String numarTelefon, String adresa) {
        if(!mapCont.containsKey(nume)) {
            IClientBanca clientBanca = new Detinator(nume, numarTelefon, adresa);
            mapCont.put(nume, clientBanca);
        }
        return mapCont.get(nume);
    }
}