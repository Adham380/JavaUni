import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public class Ausleiheverwaltung {
    private List<Ausleihe> ausleihe = new ArrayList<>();

    public Ausleiheverwaltung(Ausleihe ausleihe){
        this.ausleihe.add(ausleihe);
    }

    public Ausleihe exemplareAusleihen(Exemplar exemplar, Kunde kunde){
        Ausleihe ausleihe = new Ausleihe();
        ausleihe.anKundenÜbertragen(kunde);
        ausleihe.exemplarHinzufügen(exemplar);

        this.ausleihe.add(ausleihe);
        return ausleihe;
    }

    public void ausleiheLöschen(Ausleihe ausleihe){
        this.ausleihe.remove(ausleihe);
    }

    public List<Ausleihe> alleAusleihen(){
        return this.ausleihe;
    }

    public List<Ausleihe> alleAusleihenVonKunden(Kunde kunde){
        List<Ausleihe> ausleihe = new ArrayList<>();

        for(int i = 0; i < this.ausleihe.size(); i++){
            if(this.ausleihe.get(i).getKunde() == kunde){
                ausleihe.add(this.ausleihe.get(i));
            }
        }

        return ausleihe;
    }

    public List<Ausleihe> verspäteteAusleihen(){
        List<Ausleihe> ausleihe = new ArrayList<>();

        for(int i = 0; i < this.ausleihe.size(); i++){
            if(this.ausleihe.get(i).getStatus() == AusleiheStatus.verspätet){
                ausleihe.add(this.ausleihe.get(i));
            }
        }

        return ausleihe;
    }
}
