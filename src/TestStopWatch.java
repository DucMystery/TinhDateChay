import java.time.LocalDateTime;
import java.util.Scanner;

public class TestStopWatch {

    public static void main(String[] args) {

        StopWatch stopWatch1 = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 1 de bat dau");
        int inputNumber =scanner.nextInt();
        if (inputNumber==1){
            stopWatch1.star(LocalDateTime.now().getSecond());
        }

        System.out.println("Nhap 2 de ket thuc:");
        int inputNumber1 = scanner.nextInt();

        if (inputNumber1==2){
            stopWatch1.stop();
            System.out.println(stopWatch1.getElapsedTime());
        }
    }

}
