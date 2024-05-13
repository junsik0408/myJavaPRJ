class Rabbit5 {
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
}

    class HouseRabbit3 extends Rabbit5 {
        void move(int x, int y) {
            this.xPos = x;
            this.yPos = y;

            if (this.xPos > 100)
                this.xPos = 100;
            if (this.yPos > 100)
                this.yPos = 100;
        }
    }
    class MountainRabbit3 extends Rabbit5 {
        @Override
        void move(int x, int y) {
            super.move(x, y);
        }
    }

    public class Code08_06 {
        public static void main(String[]args) {
            HouseRabbit3 hRabbit = new HouseRabbit3();
            MountainRabbit3 mRabbit = new MountainRabbit3();

                    hRabbit.move(500,500);
                    mRabbit.move(500,500);

            System.out.printf("집토끼 위치 : (%d, %d) \n" , hRabbit.xPos, hRabbit.yPos );
                    System.out.printf("산토끼 위치 : (%d, %d) \n" , hRabbit.xPos, hRabbit.yPos);

        }
    }
