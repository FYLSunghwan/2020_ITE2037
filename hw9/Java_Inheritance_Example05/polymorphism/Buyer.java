package polymorphism;

public class Buyer {
    private int money = 1000;
    private int bonusPoint = 0;
    private Product[] item = new Product[10];
    private int i=0;

    void buy(Product p) {
        if(money < p.getPrice()) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.getPrice();
        bonusPoint += p.getBonusPoint();
        item[i++] = p;
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for(int i=0; i<item.length; i++) {
            if(item[i] == null) break;
            sum += item[i].getPrice();
            itemList += (i==0) ? "" + item[i] : ", " + item[i];
        }
        
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은" + itemList + "입니다.");
    }
}