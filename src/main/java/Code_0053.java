import java.util.Scanner;

public class Code_0053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUsername = "park";
        String correctPassword = "password123";

        System.out.print("사용자 이름을 입력하세요: ");
        String username = scanner.nextLine();

        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("로그인 성공!");
        } else if (!username.equals(correctUsername)) {
            System.out.println("사용자 이름이 잘못되었습니다.");
        } else {
            System.out.println("비밀번호가 잘못되었습니다.");
        }
    }
}
