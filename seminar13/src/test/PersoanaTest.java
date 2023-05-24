package test;

import model.ExceptieNenascut;
import model.ExceptionCNPNull;
import model.IPersoana;
import model.Persoana;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {

    @org.junit.jupiter.api.Test
    void getVarstaTestRight() {
        IPersoana persoana= new Persoana("Claudia", "6010221718190");
        assertEquals(22, persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestLimitaSuperioara() {
        IPersoana persoana= new Persoana("Claudia", "6230524022171");
        assertEquals(0, persoana.getVarsta());
    }
    @org.junit.jupiter.api.Test
    void getVarstaTestLimitaInferioara() {
        IPersoana persoana= new Persoana("Claudia", "6000101718190");
        assertEquals(23, persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaErrorConditions() {
        IPersoana persoana = new Persoana ("Andrei", "6231231123456");
        assertThrows(ExceptieNenascut.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }

    @org.junit.jupiter.api.Test
    void getVarstaPerformance(){
        IPersoana persoana = new Persoana("Andrei", "6010204718190");
        assertTimeout(Duration.ofMillis(100), () -> persoana.getVarsta());
    }

    @Test
    void cnpCaractereCorecte() {
        Persoana persoana = new Persoana("Andrei", "6010204718190");
        assertEquals(13, persoana.getCNP().length());
    }

    @Test
    void ordineVarstaPersoane(){
        Persoana persoana1 = new Persoana("Maria", "6010204718190");
        Persoana persoana2 = new Persoana("Andrei", "2980203948527");
        assertTrue(persoana1.getVarsta()<persoana2.getVarsta());
    }

    @Test
    void getVarstaShouldThrowExceptionCNPNull(){
        Persoana persoana1 = new Persoana("Maria", null);
        assertThrows(ExceptionCNPNull.class, () ->persoana1.getVarsta());
    }

    @Test
    void getVarstaCardinality(){
        Persoana persoana = new Persoana("Maria", "5220104440072");
        assertEquals(1, persoana.getVarsta());
    }

    @Test
    void verificaConstructorCrosscheck(){
        Persoana persoana1 = new Persoana("Maria","5220515009245");
        Persoana persoana2 = new Persoana();
        persoana2.setCNP("5220515009245");
        persoana2.setNume("Maria");
        assertEquals(persoana1.getCNP(), persoana2.getCNP());
        assertEquals(persoana1.getNume(), persoana2.getNume());
    }

}