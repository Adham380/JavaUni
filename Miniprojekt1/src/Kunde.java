import java.util.ArrayList;
import java.util.List;

public class Kunde extends Person{
    private String kundenID;

    private Zahlungsmethode zahlungsmethode;
    private List<Route> gebuchteRouten = new ArrayList<>();

    public Kunde(String name, String kundenID){
        super(name);

        this.kundenID = kundenID;
    }

    // Getter/ Setter
    public void setZahlungsmethode(Zahlungsmethode zahlungsmethode) {
        this.zahlungsmethode = zahlungsmethode;
    }
}
