package state.model;

public class StareRezervata implements IStare{

    @Override
    public void modificaStarea(Masa masa) {
        if (masa.getStare() instanceof StareRezervata || masa.getStare() instanceof StareOcupata){
            System.out.println("Masa este rezervata sau ocupata");
        }else{
            masa.setStare(this);
        }
    }
}