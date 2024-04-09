import java.util.Scanner;
// Q1. 숫자 입력 받아서 첫번째 시작값, 두번째가 끝나는 값까지 반복
// 02. 첫번쨰 200, 100이라면, 첫번째 수가 크다면 ... 200 , 199 , 198
// 03. 만족하는 상태에서
public class Code06_03q {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        int a = S.nextInt();
        int b = S.nextInt();

        if (a > b) {

            for (int i = a; i > b; i--) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = a; i < b; i++) {

                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
