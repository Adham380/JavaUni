import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AusleiheTest {
    @Test
    void testAusleiheSetKunde() {
        Ausleihe ausleihe = new Ausleihe();
        Kunde kunde = new Kunde();

        ausleihe.setKunde(kunde);
        kunde.addAusleihe(ausleihe);
        assertTrue(kunde.getAusleihen().contains(ausleihe));
        assertTrue(ausleihe.getKunde() == kunde);

        ausleihe.setKunde(null);
        assertTrue(!kunde.getAusleihen().contains(ausleihe));
        assertTrue(ausleihe.getKunde() == null);
    }
}