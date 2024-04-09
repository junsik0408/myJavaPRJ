public class Code03_9 {
    public static void main(String[] args) {

        int num = 20;

        System.out.println(++num + " : num 변수 출력 전에 +1이 되어서 21이 출력된다");
        System.out.println(num++ + " : nun 변수가 출력되고, +1 되기에 21이 출력한다 " );
        System.out.println(num + " 22 출력");

        num++ ; System.out.print(num +" ");
        num-- ; System.out.print(num +" ");
        num+=3 ; System.out.print(num +" ");
        num-=3 ; System.out.print(num+" ");
        num*=3 ; System.out.print(num+" ");
        num/=3; System.out.print(num+" ");
        num%=3 ; System.out.print(num+" ");

    }
}
