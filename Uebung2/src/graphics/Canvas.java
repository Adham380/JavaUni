package graphics;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private int refreshes;
    private List<Shape2D> shapes = new ArrayList<>();

    public void refresh(){
        System.out.println(this.refreshes);
        this.refreshes++;
    }

    public void addShape(Shape2D shape){
        this.shapes.add(shape);
        this.refresh();
    }

    public void detach(Shape2D shape){
        this.shapes.remove(shape);
        this.refresh();
    }

    public int getRefreshes() {
        return refreshes;
    }
}
