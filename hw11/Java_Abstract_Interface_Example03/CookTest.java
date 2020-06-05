interface ICook {
    public void makeRice();
    public void makeSoup();
    public void makeSalad();
    public void makeSource();
}

class KoreanCook implements ICook {
    public void makeRice() {
        System.out.println("한식 밥을 짓습니다.");
    }
    public void makeSoup() {
        System.out.println("고기국물을 만듭니다.");
    }
    public void makeSalad() {
        System.out.println("한식 무침을 만듭니다.");
    }
    public void makeSource() {
        System.out.println("고추장 양념장을 만듭니다.");
    }
}

class ChineseCook implements ICook {
    public void makeRice() {
        System.out.println("중식 밥을 짓습니다.");
    }
    public void makeSoup() {
        System.out.println("중식국물을 만듭니다.");
    }
    public void makeSalad() {
        System.out.println("중식 무침을 만듭니다.");
    }
    public void makeSource() {
        System.out.println("중식 양념장을 만듭니다.");
    }
}

/*
public class CookManager {
    private ICook cook = new KoreanCook();

    public void orderRice() {
        cook.makeRice();
    }

    public void orderSoup() {
        cook.makeSoup();
    }
}
*/

class CookManager {
    private ICook cook;

    public CookManager(ICook cook) {
        this.cook = cook;
    }

    public void setCook(ICook cook) {
        this.cook = cook;
    }

    public void orderRice() {
        cook.makeRice();
    }

    public void orderSoup() {
        cook.makeSoup();
    }
}

public class CookTest {
    public static void main(String[] args) {
        ICook cook = new KoreanCook();
        CookManager manager = new CookManager(cook);
        manager.orderRice();
        manager.orderSoup();

        ICook cook1 = new ChineseCook();
        manager.setCook(cook1);
        manager.orderRice();
        manager.orderSoup();
    }   
}
