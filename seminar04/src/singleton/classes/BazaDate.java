package singleton.classes;
//eager initialization
//la singleton constructorul e apelat o singura data cu new BazaDate()
public class BazaDate {

    private int dimensiuneDate;
    private int numarTabele;
    private String denumireBazaDate;

    public static BazaDate instanta = new BazaDate(100,2,"DB1");//la mom initializarii spun care e pt ca facem eager initialization

    private BazaDate(int dimensiuneDate, int numarTabele, String denumireBazaDate){
        this.denumireBazaDate=denumireBazaDate;
        this.dimensiuneDate=dimensiuneDate;
        this.numarTabele=numarTabele;
    }

    public void setDimensiuneDate(int dimensiuneDate){
        this.dimensiuneDate=dimensiuneDate;
    }

    public static BazaDate getInstanta(){
        return instanta;
    }


    @Override
    public String toString() {
        return "BazaDate{" +
                "dimensiuneDate= " + dimensiuneDate +
                " denumireBazaDate" + denumireBazaDate +
                " numarTabele" + numarTabele +
                "}";
    }
}
