class FruitSeller {
    private int applePrice;
    private int numOfApples;
    private int myMoney;

    public FruitSeller(int applePrice, int numOfApples, int myMoney) {
        this.applePrice = applePrice;
        this.numOfApples = numOfApples;
        this.myMoney = myMoney;
    }
    public int saleApples(int money) {
        int num = money / applePrice;
        numOfApples -= num;
        myMoney += money;
        return num;
    }

    public void showSalesResult() {
        System.out.println("남은 사과: " + numOfApples);
        System.out.println("판매 수익: " + myMoney);
    }
}
class FruitBuyer {
    private int myMoney;
    private int numOfApples;

    public FruitBuyer(int myMoney) {
        this.myMoney = myMoney;
        numOfApples = 0;
    }
    public void buyApples(FruitSeller seller, int money) {
        numOfApples += seller.saleApples(money);
        myMoney -= money;
    }
    public void showBuyResult() {
        System.out.println("현재 잔액: " + myMoney);
        System.out.println("사과 개수: " + numOfApples);
    }
}
class BuyFruitTest {
    public static void main(String[] args) {
        FruitSeller seller = new FruitSeller(1000, 20, 0);
        FruitBuyer buyer = new FruitBuyer(5000);
        buyer.buyApples(seller, 2000);

        System.out.println("과일 판매자의 현황");
        seller.showSalesResult();
        System.out.println("과일 구매자의 현황");
        buyer.showBuyResult();
    }
}
