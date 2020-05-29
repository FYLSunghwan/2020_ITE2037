package bookStore;

public class Book {
    private String name;
    private int amount;
    protected double price;

    public Book() {
    }
    public Book(String name) {
        this.name = name;
        this.amount = 1;
        this.price = 0;
    }
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
        this.amount = 1;
    }
    public Book(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    public String getName() {
        return this.name;
    }
    public int getAmt() {
        return this.amount;
    }
    public double getPrice() {
        return this.price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAmt(int amount) {
        this.amount = amount;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void incAmt(int amount) {
        this.amount+=amount;
    }
    public void incAmt() {
        this.amount++;
    }
    public void descAmt() {
        if(this.amount==0) System.out.println("Book>ERR: EMPTY\n");
        else this.amount--;
    }
}