public class hw1_2 {
    public static void main(String[] args) {
        int total_sec = 50391;
        int hour = total_sec/3600;
        int min = (total_sec%3600)/60;
        int sec = (total_sec%60);
        System.out.println(hour+" hours, "+min+" minutes, and "+sec+" seconds.");
    }
}
