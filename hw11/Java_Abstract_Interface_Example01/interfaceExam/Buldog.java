package interfaceExam;

public class Buldog implements Runnable {
    public void start() {
        System.out.println("Buldog 네발로 출발한다");
    }

    public void running() {
        System.out.println("Buldog 최고속도로 4발로 뛴다");
    }

    public void stop() {
        System.out.println("Buldog 먹이를 보고 멈추었다");
    }
}
