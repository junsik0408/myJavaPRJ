import java.util.Scanner;

public class Code_0077 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 (0 - 100): ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("성적: A");
        } else if (score >= 80) {
            System.out.println("성적: B");
        } else if (score >= 70) {
            System.out.println("성적: C");
        } else if (score >= 60) {
            System.out.println("성적: D");
        } else {
            System.out.println("성적: F");
        }

        scanner.close();
    }
}
