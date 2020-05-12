class Car {
    private int speed;
    private int mileage;
    private String color;

    public Car() {
        speed = mileage = 0;
        color = "red";
    }
    public void speedUp() {
        speed += 10;
    }
    public String toString() {
        return "속도: " + speed + " 주행거리: " + mileage + " 색상: " + color;
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        for(int i=0;i<cars.length;i++) cars[i] = new Car();
        for(int i=0;i<cars.length;i++) cars[i].speedUp();
        for(int i=0;i<cars.length;i++) System.out.println(cars[i]);
    }
}