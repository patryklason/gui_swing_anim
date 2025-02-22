package figury;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class Kwadrat extends Figura{
    public Kwadrat(Graphics2D buffer, int delay, int w, int h) {
        super(buffer, delay, w, h);
        shape = new Rectangle2D.Float(0, 0, 20, 10);
        aft = new AffineTransform();
        area = new Area(shape);
    }
}
