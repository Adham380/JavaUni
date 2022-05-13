import graphics.Canvas;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import graphics.*;

public class CanvasTest {
    @Test
    void CanvasRefhreshTest(){
        Canvas canvas = new Canvas();
        Shape2D shape = Shape2D.createShape("Rectangle", 0, 0, canvas);
        //assertEquals(canvas.getRefreshes(), 1);
    }
}
