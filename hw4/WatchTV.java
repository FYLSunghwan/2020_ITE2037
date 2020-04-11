class TV {
    boolean power;
    int channel;
    int volume;
    public TV() {
        this.power = false;
        this.channel = 9;
        this.volume = 20;
    }
    public void powerOn() {
        if(power) System.out.println("TV가 꺼졌습니다.");
        else System.out.println("TV가 켜졌습니다.");
        power = !power;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
    public void channelUp() {
        this.channel ++;
    }
    public void volumeUp() {
        this.volume ++;
    }
    public int getChannel() {
        return this.channel;
    }
    public int getVolume() {
        return this.volume;
    }
}

public class WatchTV {
    public static void main(String[] args) {
        //처음 tv의 채널은 9번, 볼륨은 20, 전원은 꺼져있다.
        TV tv = new TV();
        tv.powerOn();
        System.out.printf("현재 TV채널은 %d입니다.\n", tv.getChannel());
        System.out.printf("현재 TV볼륨은 %d입니다.\n", tv.getVolume());
        tv.setChannel(16);
        tv.channelUp();
        tv.volumeUp();
        tv.volumeUp();
        System.out.printf("현재 TV채널은 %d입니다.\n", tv.getChannel());
        System.out.printf("현재 TV볼륨은 %d입니다.\n", tv.getVolume());
        tv.powerOn();
    }
}
