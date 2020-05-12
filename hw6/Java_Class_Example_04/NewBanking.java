class Account {
    private String name;
    private long balance;

    public Account() {
    }

    public Account(String name) {
        this.name = name;
        System.out.println(name + "님의 계좌가 만들어 졌습니다.");
    }

    public void deposit(long amount) {
        balance = balance + amount;
        System.out.println(name + "님의 계좌에 " + amount + "원이 입금되었습니다.");
    }

    public void withdraw(long amount) {
        if(balance < amount) System.out.println(name + "님의 계좌에 잔고가 부족합니다.");
        else {
            balance = balance - amount;
            System.out.println(name + "님의 계좌에서 " + amount + "원이 출금되었습니다.");
        }
    }

    public long getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}

class AccountManager {
    private int accountNum;
    private Account[] accounts;

    public AccountManager() {
        accounts = new Account[10];
    }

    public void newAccount(String name) {
        if(accountNum < 10) accounts[accountNum++] = new Account(name);
        else System.out.println("계좌가 10개를 초과했습니다.");
    }

    public void deposit(String name, long amount) {
        for(int i=0;i<accountNum;i++) {
            if(accounts[i].getName().equals(name)) {
                accounts[i].deposit(amount);
                break;
            }
        }
    }

    public void withdraw(String name, long amount) {
        for(int i=0;i<accountNum;i++) {
            if(accounts[i].getName().equals(name)) {
                accounts[i].withdraw(amount);
                break;
            }
        }
    }

    public String getBalance(String name) {
        String str = null;
        for(int i=0;i<accountNum;i++) {
            if(accounts[i].getName().equals(name)) {
                str = name + "님의 잔고는 " + accounts[i].getBalance() + "원 입니다.";
                break;
            }
        }
        return str;
    }
}

public class NewBanking {
    public static void main(String[] args) {
        AccountManager am = new AccountManager();
        am.newAccount("손오공");
        am.newAccount("저팔계");
        am.newAccount("사오정");
        am.deposit("손오공", 1000);
        System.out.println(am.getBalance("손오공"));
        am.withdraw("손오공", 2000);
        am.withdraw("손오공", 1000);
        System.out.println(am.getBalance("손오공"));
        am.deposit("저팔계", 3000);
        System.out.println(am.getBalance("저팔계"));
        am.withdraw("저팔계", 2000);
        am.withdraw("저팔계", 1000);
        System.out.println(am.getBalance("저팔계"));
        am.deposit("사오정", 1000);
        System.out.println(am.getBalance("사오정"));
        am.withdraw("사오정", 2000);
        am.withdraw("사오정", 1000);
        System.out.println(am.getBalance("사오정"));
    }
}