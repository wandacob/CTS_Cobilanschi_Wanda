package main;

import singleton.classes.BazaDate;
import singleton.classes.Secretariat;

public class Main {

    public static void main(String[] args) {
        Secretariat secretariat1 = Secretariat.getInstanta(2043,10);
        Secretariat secretariat2 = Secretariat.getInstanta(2011,20);

        System.out.println(secretariat1);
        System.out.println(secretariat2);

        BazaDate bazaDate1 = BazaDate.getInstanta();
        BazaDate bazaDate2 = BazaDate.getInstanta();
        System.out.println(bazaDate1);
        System.out.println(bazaDate2);
        bazaDate1.setDimensiuneDate(200);
        bazaDate2.setDimensiuneDate(300);
        System.out.println(bazaDate1);
        System.out.println(bazaDate2);
    }
}
