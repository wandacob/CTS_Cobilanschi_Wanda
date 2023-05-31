package test;

import dubluri.FakePersoana;
import model.PachetTuristic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AplicaDiscountTest {

    @Test
    void nuAplicaDiscount(){
        FakePersoana fakePersoana = new FakePersoana();
        fakePersoana.setGetVarstaValue(6);
        PachetTuristic pachetTuristic = new PachetTuristic(fakePersoana,"Eforie",100.0);

        pachetTuristic.aplicaDiscountVarstnici(25);
        assertEquals(100,pachetTuristic.getPret());
    }

    @Test
    void aplicaDiscount(){
        FakePersoana fakePersoana = new FakePersoana();
        fakePersoana.setGetVarstaValue(89);
        PachetTuristic pachetTuristic = new PachetTuristic(fakePersoana,"Mamaia",1000.0);

        pachetTuristic.aplicaDiscountVarstnici(25);
        assertEquals(750,pachetTuristic.getPret());
    }

}