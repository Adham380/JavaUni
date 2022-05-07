import java.util.ArrayList;
import java.util.List;

public class Route {
    private Haltepunkt abfahrtPunkt;
    private Haltepunkt endPunkt;

    private List<Haltepunkt> zwischenStops = new ArrayList<>();

    public Route(Haltepunkt abfahrtPunkt, Haltepunkt endPunkt){
        this.abfahrtPunkt = abfahrtPunkt;
        this.endPunkt = endPunkt;
    }

    public void addZwischenStop(Haltepunkt haltepunkt){
        zwischenStops.add(haltepunkt);
    }

    // Getter/ Setter
    public void setZwischenStops(List<Haltepunkt> zwischenStops) {
        this.zwischenStops = zwischenStops;
    }

    public Haltepunkt getAbfahrtPunkt() {
        return abfahrtPunkt;
    }

    public Haltepunkt getEndPunkt() {
        return endPunkt;
    }

    public List<Haltepunkt> getZwischenStops() {
        return zwischenStops;
    }
}
