package Java_Abstract_Interface_Example04;
import java.awt.*;

public class DrawableCircle extends Circle implements Drawable {
    public DrawableCircle() {
        this(0, 0, 0);
    }

    public DrawableCircle(int x, int y, int r) {
        super(r);
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g) {
        g.drawOval(x-r, y-r, 2*r, 2*r);
        g.drawString(String.valueOf(area()), x-r, y);
    }
}
