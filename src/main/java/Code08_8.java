abstract class Rabbit7 {
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    abstract void sleep();
}
    class HouseRabbit7 extends Rabbit7 {
        void sleep() {
            System.out.println("집토끼가 우리에서 잠자고 있습니다.");
        }
    }

    class MountainRabbit7 extends Rabbit7 {
        void sleep() {
            System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
        }
    }
    public class Code08_8 {
        public static void main(String[] args) {
            HouseRabbit7 hRabbit = new HouseRabbit7();
            MountainRabbit7 mRabbit = new MountainRabbit7();

            hRabbit.sleep();
            mRabbit.sleep();

        }

}
