import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Ausleihe {
    private Kunde kunde;

    public Date getStartDatum() {
        return startDatum;
    }

    public void setStartDatum(Date startDatum) {
        this.startDatum = startDatum;
    }

    private Date startDatum;

    public Date getEndDatum() {
        return endDatum;
    }

    public void setEndDatum(Date endDatum) {
        this.endDatum = endDatum;
    }

    private Date endDatum;
    private AusleiheStatus status;

    List<Exemplar> ausgelieheneExemplare = new ArrayList<>();

    public Ausleihe(){
    }

    public void verlängern(Date neuesEndDatum){
        this.endDatum = neuesEndDatum;
    }

    public void anKundenÜbertragen(Kunde neuerKunde){
        this.kunde.removeAusleihe(this);
        this.kunde = neuerKunde;
    }

    public int exemplarHinzufügen(Exemplar exemplar){
        return 0;
    }

    public void setKunde(Kunde kunde){
        if(kunde == null){
            this.kunde.removeAusleihe(this);
        }
        this.kunde = kunde;
    }

    public Kunde getKunde(){
        return this.kunde;
    }
}
