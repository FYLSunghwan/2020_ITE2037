package interfaceExam;

public interface Runnable {
    public final static int MAXSPEED = 50;
    int MINSPEED = 10;

    public void start();

    public void running();

    public void stop();
}
