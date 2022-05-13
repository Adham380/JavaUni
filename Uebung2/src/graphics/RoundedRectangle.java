package graphics;

public class RoundedRectangle extends Rectangle{
    private double cornerRadius;

    @Override
    public double area(){
        return this.getWidth() * this.getHeight() - cornerRadius * cornerRadius * (4-Math.PI);
    }

    public RoundedRectangle(double xPos, double yPos, Canvas canvasRef){
        super(xPos, yPos, canvasRef);
    }

    public double getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(double cornerRadius) {
        this.notifyCanvas();
        this.cornerRadius = cornerRadius;
    }
}
