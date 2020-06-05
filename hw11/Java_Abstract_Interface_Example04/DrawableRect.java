package Java_Abstract_Interface_Example04;
import java.awt.*;

public class DrawableRect extends Rect implements Drawable {
    public DrawableRect() {
        this(0, 0, 0, 0);
    }

    public DrawableRect(int x, int y, int w, int h) {
        super(w, h);
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g) {
        g.drawRect(x, y, width, height);
        g.drawString(String.valueOf(area()), x, y + height/2);
    }
}
