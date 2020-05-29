package bookStore;

public class OldBook extends Book {
    private int disRate;

    public OldBook() {
        super();
        disRate = 0;
    }
    public OldBook(String name) {
        super(name);
        disRate = 0;
    }
    public OldBook(String name, double price) {
        super(name, price);
        disRate = 0;
    }
    public OldBook(String name, double price, int amount) {
        super(name, price, amount);
        disRate = 0;
    }
    public OldBook(String name, double price, int amount, int disRate_) {
        super(name, price, amount);
        disRate = disRate_;
    }
    public double getPrice() {
        double price = (double)this.price * (100-(double)disRate) / 100.;
        return price;
    }
}
