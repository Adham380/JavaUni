package graphics;

public class Circle extends Shape2D{
    private double radius;

    @Override
    public void scale(double factor){
        this.notifyCanvas();
        this.radius *= factor;
    }

    @Override
    public void shift(double x, double y){
        this.setxPos(this.getxPos() + x);
        this.setyPos(this.getyPos() + y);
        this.notifyCanvas();

        super.shiftChildShape(x, y);
    }

    public Circle(double xPos, double yPos, Canvas canvasRef){
        super(xPos, yPos, canvasRef);
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    // Getter / Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.notifyCanvas();
        this.radius = radius;
    }
}
