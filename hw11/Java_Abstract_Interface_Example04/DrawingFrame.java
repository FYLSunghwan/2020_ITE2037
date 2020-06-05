package Java_Abstract_Interface_Example04;
import java.awt.*;
import javax.swing.*;

public class DrawingFrame extends JFrame {
    protected Drawable drawable[];

    public DrawingFrame() {
        super("그림판");
        drawable = new Drawable[3];
        drawable[0] = new DrawableCircle(65, 75, 30);
        drawable[1] = new DrawableRect(125, 125, 70, 65);
        drawable[2] = new DrawableCircle(230, 100, 60);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        int n = drawable.length;
        for(int i=0;i<n;i++) {
            drawable[i].paint(g);
        }
    }

    public static void main(String args[]) {
        new DrawingFrame();
    }
}
