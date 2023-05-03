package strategy.clasa;

public class VerificarePersoanaFizica implements ModVerificare{
    @Override
    public void verifica() {
        System.out.println("Verifica buletinul persoanei fizice.");
    }
}