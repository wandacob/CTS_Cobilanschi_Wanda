import spital.facade.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.interneazaPacient("Maria");
        facade.interneazaPacient("Andrei");
        facade.interneazaPacient("Frederico");
        facade.interneazaPacient("Maria");
    }
}
