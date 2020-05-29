package polymorphism;

public class Product {
    private int price;
    private int bonusPoint;

    public Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    public Product() {
        price = 0;
        bonusPoint = 0;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }
}