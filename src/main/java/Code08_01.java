class Rabbit2 {
    String shape;
    int xPos;
    int ypos;
    static int count;

    Rabbit2(){
        count++;
    }
}
public class Code08_01 {
    public static void main(String[] args) {
        System.out.println("객체 생성 전의 총 토끼수 ==>" + Rabbit2.count);

        Rabbit2 rabbit2 = new Rabbit2();
        System.out.println("토끼 객체1 생성 후의 총 토끼의 수 ==>" + Rabbit2.count);

        Rabbit2 rabbit3 = new Rabbit2();
        System.out.println("토끼 객체2 생성 후의 총 토끼 수 ==>" + Rabbit2.count);
    }
}
