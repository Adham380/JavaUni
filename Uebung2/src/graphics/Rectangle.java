package graphics;

public class Rectangle extends Shape2D{
    private double width;
    private double height;

    public double area(){
        return width * height;
    }

    @Override
    public void scale(double factor){
        this.width *= factor;
        this.height *= factor;
        this.notifyCanvas();
    }

    @Override
    public void shift(double x, double y){
        this.setxPos(this.getxPos() + x);
        this.setyPos(this.getyPos() + y);
        this.notifyCanvas();

        super.shiftChildShape(x, y);
    }

    public Rectangle(double xPos, double yPos, Canvas canvasRef){
        super(xPos, yPos, canvasRef);
    }

    //Getter / Setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        this.notifyCanvas();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.notifyCanvas();
    }
}
