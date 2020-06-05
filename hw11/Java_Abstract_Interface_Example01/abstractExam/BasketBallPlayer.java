package abstractExam;

public class BasketBallPlayer extends SportsPlayer {
    public BasketBallPlayer(String name, int age, int money) {
        super(name, age, money);
    }

    public void playGame() {
        System.out.println(getName() + "이/가 손으로 공을 던집니다.");
    }
}
