import java.util.Scanner;

public class Code_Exam3 {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        System.out.print("값 입력 : ");
        int a=S.nextInt();

        if(a%3==0&&a%5==0) {
            System.out.println("3의 배수 , 5의 모두 만족합니다.");
        }
        else if (a%3==0) {
            System.out.println("3의 배수입니다.");
        }
        else if (a%5==0) {
            System.out.println("5의 배수입니다.");
        }
        else {
            System.out.println("3의 배수 , 5의 배수 모두 만족하지 않습니다.");
        }


    }


    // Scanner로 입력받는 값이
    // 3의 배수인지?
    // 5의 배수인지?
    // 3의 배수와 5의 배수를 모두 만족하는지
    // 출력하는 프로그래밍

    /*출력 예 : 3의 배수 입니다.
        5의 배수 입니다.
        3의 배수. 5의 배수 모두 만족합니다*/
}
