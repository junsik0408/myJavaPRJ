class Rabbit {
    String shape; // 토끼모양
    int xPos;
    int yPos;

    void  setPosition(int x, int y) {
        xPos = x;
        yPos = y;

        System.out.println("xPos: " + xPos + " / yPos : " + this.yPos);
    }
}

public class Code7_6 {
    public static void main(String[] args) {

        Rabbit rb1 = new Rabbit();
        rb1.setPosition(100, 100);

        Rabbit rb2 = new Rabbit();
        rb1.setPosition(200, 200);


    }
}
