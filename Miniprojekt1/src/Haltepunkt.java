public class Haltepunkt {
    private float coordX;
    private float coordY;

    private String adresse;

    public Haltepunkt(String adresse){
        this.adresse = adresse;
    }

    // Getter/ Setter
    public String getAdresse() {
        return adresse;
    }

    public float getCoordX() {
        return coordX;
    }

    public void setCoordX(float coordX) {
        this.coordX = coordX;
    }


    public float getCoordY() {
        return coordY;
    }

    public void setCoordY(float coordY) {
        this.coordY = coordY;
    }
}
