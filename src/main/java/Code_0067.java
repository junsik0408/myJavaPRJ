import java.util.Scanner;

public class Code_0067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("차량의 속도를 입력하세요 (km/h): ");
        int speed = scanner.nextInt();

        if (speed > 120) {
            System.out.println("속도 초과! 과속입니다.");
        } else if (speed > 80) {
            System.out.println("안전 속도로 운전 중입니다.");
        } else if (speed > 40) {
            System.out.println("천천히 주행 중입니다.");
        } else {
            System.out.println("속도가 너무 느립니다. 속도를 올리세요.");
        }

        scanner.close();
    }
}
