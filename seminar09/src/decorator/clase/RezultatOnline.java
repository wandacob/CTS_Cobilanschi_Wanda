package decorator.clase;

public class RezultatOnline extends DecoratorAbstract{
    public RezultatOnline(FurnizareRezultat atr) {
        super(atr);
    }

    @Override
    public void afisareOnline(String diagnostic) {
        System.out.println("Site: "+diagnostic);
    }
}
