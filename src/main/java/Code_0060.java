import java.util.Scanner;

public class Code_0060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 기본적으로 설정된 사용자 정보
        String correctUsername = "admin";
        String correctPassword = "password123";

        // 사용자 입력
        System.out.print("아이디를 입력하세요: ");
        String username = scanner.nextLine();

        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();

        // 로그인 판단
        if (username.equals(correctUsername)) {
            if (password.equals(correctPassword)) {
                System.out.println("로그인 성공! 환영합니다.");
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
        } else {
            System.out.println("아이디가 틀렸습니다.");
        }

        scanner.close();
    }
}
