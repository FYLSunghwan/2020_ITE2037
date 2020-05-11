class NotebookComp extends Computer {
    private int battery;
    public NotebookComp(String name, int initChag) {
        super(name);
        battery = initChag;
    }
    public void charge() {
        battery += 5;
    }
    public void useBattery() {
        battery -= 1;
    }
    public void movingCal() {
        if(getBatteryInfo() < 1) {
            System.out.println("충전이 필요합니다.");
            return;
        }
        
        System.out.println("이동하면서 ");
        calculate();
        useBattery();
    }
    public int getBatteryInfo() {
        return battery;
    }
}
