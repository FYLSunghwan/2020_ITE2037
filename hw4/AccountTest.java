class Account {
    private String name;
    private int balance;
    public Account() {
        this("홍길동", 0);
    }
    public Account(String name) {
        this(name, 0);
    }
    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    public int deposit(int money) {
        balance += money;
        return money;
    }
    public int withdraw(int money) {
        if(money > balance) {
            System.out.println("잔액이 부족합니다.");
            return 0;
        }
        balance-=money;
        return money;
    }
    public String getName() {
        return this.name;
    }
    public int getBalance() {
        return this.balance;
    }
}

public class AccountTest {
    public static void main(String[] args) {
        System.out.println("--------- 홍길동 계좌 --------- ");
        Account a = new Account("홍길동", 10000);
        System.out.printf("%d원이 입금되었습니다.\n",a.deposit(20000));
        System.out.printf("%s님의 잔액은 %d입니다.\n", a.getName(), a.getBalance());
        System.out.printf("%d원이 출금되었습니다.\n", a.withdraw(40000));
        System.out.printf("%d원이 출금되었습니다.\n", a.withdraw(10000));
        System.out.printf("%s님의 잔액은 %d입니다.\n", a.getName(), a.getBalance());

        System.out.println("--------- 사오정 계좌 --------- ");
        Account b = new Account("사오정");
        b.withdraw(1000);
        System.out.printf("%s님의 잔액은 %d입니다.", b.getName(), b.getBalance());
    }
}