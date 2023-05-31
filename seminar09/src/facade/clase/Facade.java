package facade.clase;

public class Facade {
    private Medic medic;
    private Salon salon;

    public Facade () {
        this.medic = new Medic();
        this.medic.adaugaPacient(new Pacient("Maria", 1));
        this.medic.adaugaPacient(new Pacient("Andrei", 7));
        this.medic.adaugaPacient(new Pacient("Nicolae", 4));
        this.salon = new Salon();
        salon.adaugaPaturiLibere(23);
        salon.adaugaPaturiLibere(41);
    }
    public void interneazaPacient(String nume) {
        if(medic.verificaTrimitere(medic.getPacient(nume))) {
            if(salon.verificaPaturiLibere()){
                if(medic.getPacient(nume).getGravitate()>4){
                    salon.ocupaPat();
                    System.out.println("Pacientul "+nume+" a fost internat");
                }
                else {
                    System.out.println("Nu este grav. Mergeti acasa");
                }
            }
            else {
                System.out.println("Nu avem paturi libere. Mergeti in alta parte.");
            }
        }
        else {
            System.out.println("Nu aveti medic. Primiti trimitere");
        }
    }
}
