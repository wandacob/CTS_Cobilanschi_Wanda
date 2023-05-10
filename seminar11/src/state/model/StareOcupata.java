package state.model;

public class StareOcupata implements IStare{
    @Override
    public void modificaStarea(Masa masa) {
        if (masa.getStare() instanceof StareOcupata){
            System.out.println("Masa s-a ocupat acum");
        }else{
            masa.setStare(this);
            System.out.println("Masa este deja ocupata");
        }
    }
}