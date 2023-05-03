package strategy.main;

import strategy.clasa.Operator;
import strategy.clasa.VerificarePersoanaFizica;
import strategy.clasa.VerificarePersoanaJuridica;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        operator.verificaClient();

        operator.setModVerificare(new VerificarePersoanaJuridica());
        operator.verificaClient();
    }
}