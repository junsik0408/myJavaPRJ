
import java.util.Scanner;
public class Code9_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numAry = new int[4];
        int hap = 0;

        System.out.print("숫자 : ");
        numAry[0] = s.nextInt();
        System.out.print("숫자 : ");
        numAry[1] = s.nextInt();
        System.out.print("숫자 : ");
        numAry[2] = s.nextInt();
        System.out.print("숫자 : ");
        numAry[3] = s.nextInt();

        for (int i = 0; i < 4; i++) {
            hap+=numAry[i];

        }

        hap = numAry[0] + numAry[1] + numAry[2] + numAry[3];
        System.out.println("합계 ==> " + hap);

        s.close();

    }
}
