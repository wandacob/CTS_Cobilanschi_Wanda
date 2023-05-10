
package state.model;

public class StareLibera implements IStare{

    @Override
    public void modificaStarea(Masa masa) {
        if (!(masa.getStare() instanceof StareLibera)){
            System.out.println("Masa este eliberata acum");
        }else{
            System.out.println("Masa este deja libera");
            masa.setStare(this);
        }
    }
}