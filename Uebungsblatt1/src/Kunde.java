import java.util.ArrayList;
import java.util.List;

public class Kunde {
    List<Ausleihe> ausleihen;

    public Kunde() {
        this.ausleihen = new ArrayList<>();
    }

    public void addAusleihe(Ausleihe ausleihe) {
        ausleihe.setKunde(this);
        this.ausleihen.add(ausleihe);
    }

    public List<Ausleihe> getAusleihen(){
        return this.ausleihen;
    }

    public void removeAusleihe(Ausleihe ausleihe){
        this.ausleihen.remove(ausleihe);
    }
}


