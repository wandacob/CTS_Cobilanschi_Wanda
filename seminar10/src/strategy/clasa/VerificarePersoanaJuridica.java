package strategy.clasa;

public class VerificarePersoanaJuridica implements ModVerificare{
    @Override
    public void verifica() {
        System.out.println("Verifica persoana juridica la registrul comertului.");
    }
}