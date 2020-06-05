package Java_Abstract_Interface_Example04;

public abstract class Shape {
    protected int x, y;
    public abstract double area();
    public abstract double circumference();
    public void move(int x1, int y1) {
        x += x1;
        y += y1;
    }
}
