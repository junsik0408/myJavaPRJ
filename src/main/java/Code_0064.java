import java.util.Scanner;

public class Code_0064 {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

           // 사용자로부터 월 입력 받기
           System.out.print("월을 입력하세요 (1 ~ 12): ");
           int month = scanner.nextInt();

           // 월에 따른 계절 분류
           if (month >= 3 && month <= 5) {
               System.out.println("봄입니다.");
           } else if (month >= 6 && month <= 8) {
               System.out.println("여름입니다.");
           } else if (month >= 9 && month <= 11) {
               System.out.println("가을입니다.");
           } else if (month == 12 || month == 1 || month == 2) {
               System.out.println("겨울입니다.");
           } else {
               System.out.println("잘못된 월을 입력했습니다.");
           }

           scanner.close();
       }
   }
