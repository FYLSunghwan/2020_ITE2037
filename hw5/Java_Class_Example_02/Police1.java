class Gun1 {
    private int bullet;

    public Gun1(int bullet) {
        this.bullet = bullet;
    }
    public void shut() {
        System.out.println("BBANG!");
        bullet--;
    }
}

public class Police1 {
    private int handcuffs;

    public Police1(int handcuffs) {
        this.handcuffs = handcuffs;
    }
    public void putHandcuff() {
        System.out.println("SNAP!");
        handcuffs--;
    }
    public void shut(Gun1 pistol) {
        if(pistol == null) System.out.println("HUT BBANG!");
        else pistol.shut();
    }
    public static void main(String[] args) {
        Police1 p1 = new Police1(3);
        Gun1 pistol = new Gun1(3);
        p1.shut(pistol);
        p1.putHandcuff();

        Police1 p2 = new Police1(3);
        Gun1 pistol1 = null;
        p2.shut(pistol1);
        p2.putHandcuff();
    }
}
