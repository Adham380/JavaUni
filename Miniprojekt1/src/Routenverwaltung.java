public class Routenverwaltung {
    private Route route;
    private Fahrer fahrer;
    private Haltepunkt aktuellerHaltepunkt;

    public Routenverwaltung(Fahrer fahrer){
        this.fahrer = fahrer;
    }

    public Haltepunkt letztenHaltepunktEinsehen(){
        return this.route.getEndPunkt();
    }

    public Haltepunkt nächstenHaltepunktEinsehen(){
        if(aktuellerHaltepunkt == route.getAbfahrtPunkt()){
            return route.getZwischenStops().get(0);
        }
        if(route.getZwischenStops().indexOf(aktuellerHaltepunkt) < 0){
            return null;
        }

        int index = route.getZwischenStops().indexOf(aktuellerHaltepunkt) + 1;
        if(index >= route.getZwischenStops().size()){
            return route.getEndPunkt();
        }
        else{
            return route.getZwischenStops().get(index);
        }
    }

    public void haltePunktBestätigen(){
        this.aktuellerHaltepunkt = this.nächstenHaltepunktEinsehen();
    }

    // Getter/ Setter
    public void setRoute(Route route) {
        this.route = route;
        this.aktuellerHaltepunkt = route.getAbfahrtPunkt();
    }
}
