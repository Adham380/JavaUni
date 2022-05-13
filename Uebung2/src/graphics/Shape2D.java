package graphics;

import java.awt.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape2D implements IShiftable, IScalable{
    private double xPos;
    private double yPos;

    private List<Shape2D> shapes = new ArrayList<>();
    private Canvas canvas;

    public abstract double area();

    public Shape2D(double xPos, double yPos, Canvas canvasRef){
        this.xPos = xPos;
        this.yPos = yPos;
        this.canvas = canvasRef;

        canvasRef.addShape(this);
    }

    public static Shape2D createShape(String kind, double xPos, double yPos, Canvas canvasRef){
        switch (kind){
            case "Rectangle" : return new Rectangle(xPos, yPos, canvasRef);
            case "RoundedRectangle" : return new RoundedRectangle(xPos, yPos, canvasRef);
            case "Circle" : return new Circle(xPos, yPos, canvasRef);
            default: throw new IllegalArgumentException();
        }
    }

    public void shiftChildShape(double x, double y){
        for(Shape2D shape : this.shapes){
            shape.shift(x, y);
        }
    }

    public void scaleChildShape(double factor){
        for(Shape2D shape : this.shapes){
            shape.scale(factor);
        }
    }

    public void addChildShape(Shape2D shape){
        this.shapes.add(shape);
    }

    public void removeChildShape(Shape2D shape){
        this.shapes.add(shape);
    }

    public void notifyCanvas(){
        this.canvas.refresh();
    }

    public void detach(){
        this.canvas.detach(this);
        this.canvas = null;
    }

    // Getter / Setter
    public Canvas getCanvas() {
        return canvas;
    }

    public double getxPos() {
        return xPos;
    }

    public void setxPos(double xPos) {
        this.xPos = xPos;
        this.notifyCanvas();
    }


    public double getyPos() {
        return yPos;
    }

    public void setyPos(double yPos) {
        this.yPos = yPos;
        this.notifyCanvas();
    }
}
