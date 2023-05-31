package test;

import dubluri.StubPersoana;
import dubluri.StubPersoanaMajora;
import model.PachetTuristic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PoateRezervaTest {

    @Test
    void unMinorNuPoateRezerva() {
        StubPersoana stubPersoana = new StubPersoana();
        PachetTuristic pachetTuristic = new PachetTuristic(stubPersoana, "Italia", 1200.5);
        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    void unMajorPoateRezerva() {
        StubPersoanaMajora stubPersoanaMajora = new StubPersoanaMajora();
        PachetTuristic pachetTuristic = new PachetTuristic(stubPersoanaMajora, "Spania", 2200.5);
        assertTrue(pachetTuristic.poateRezerva());
    }

}