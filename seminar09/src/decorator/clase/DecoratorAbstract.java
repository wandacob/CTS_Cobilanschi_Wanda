package decorator.clase;

public abstract class DecoratorAbstract implements FurnizareRezultat {
    private FurnizareRezultat atr;
    @Override
    public void printareRezultat(String diagnostic) {//e adaptor deci foloseste functionalitatea pe care o avem deja
        atr.printareRezultat(diagnostic);
    }

    public DecoratorAbstract(FurnizareRezultat atr) {
        this.atr=atr;
    }

    public abstract void afisareOnline(String diagnostic);
}
