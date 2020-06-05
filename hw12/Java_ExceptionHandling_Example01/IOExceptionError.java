import java.io.*;

public class IOExceptionError {
    public static void main(String args[]) {
        try {
            FileReader file = new FileReader("a.txt");
            int i;
            while((i = file.read()) != -1) {
                System.out.print((char) i);
            }
            file.close();
        } catch(Exception e) {
            System.out.println("예외 처리 루틴 : " + e + "예외 발생");
        }
    }
}
