ls

public class Rect extends Shape{
    protected int width, height;

    public Rect() {
        this(0, 0);
    }

    public Rect(int w, int h) {
        width = w;
        height = h;
    }

    public double circumference() {
        return 2*(width+height);
    }

    public double area() {
        return width*height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setSize(int w, int h) {
        width = w;
        height = h;
    }
}
