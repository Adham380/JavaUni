import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KundeTest {
    @Test
    void testKundeAddAusleihe(){
        Ausleihe ausleihe = new Ausleihe();
        Kunde kunde = new Kunde();

        kunde.addAusleihe(ausleihe);
        assertTrue(kunde.getAusleihen().contains(ausleihe));
        assertTrue(ausleihe.getKunde() == kunde);
    }

    @Test
    void testKundeRemoveAusleihe(){
        Ausleihe ausleihe = new Ausleihe();
        Kunde kunde = new Kunde();

        kunde.addAusleihe(ausleihe);
        kunde.removeAusleihe(ausleihe);

        assertTrue(!kunde.getAusleihen().contains(ausleihe));
        assertTrue(ausleihe.getKunde() == null);
    }

}