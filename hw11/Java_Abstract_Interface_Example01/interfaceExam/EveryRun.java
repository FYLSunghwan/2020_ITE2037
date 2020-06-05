package interfaceExam;

public class EveryRun {
    public static void main(String[] args) {
        Runnable[] runnables = {new Park(), new Buldog()};

        for(Runnable runnable : runnables) {
            runnable.start();
            runnable.running();
            runnable.stop();
        }
    }
}
