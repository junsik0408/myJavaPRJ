import java.util.Random;
import java.util.Scanner;

public class Code_0061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 컴퓨터의 선택 (0: 가위, 1: 바위, 2: 보)
        int computerChoice = random.nextInt(3);

        // 사용자 입력
        System.out.println("가위(0), 바위(1), 보(2)를 선택하세요:");
        int userChoice = scanner.nextInt();

        // 사용자와 컴퓨터의 선택을 비교
        if (userChoice == computerChoice) {
            System.out.println("비겼습니다.");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)) {
            System.out.println("이겼습니다!");
        } else {
            System.out.println("졌습니다.");
        }

        scanner.close();
    }
}
