package abstractExam;

public class SoccerPlayer extends SportsPlayer {
    public SoccerPlayer(String name, int age, int money) {
        super(name, age, money);
    }

    public void playGame() {
        System.out.println(getName() + "이/가 발로 공을 찹니다.");
    }
}
