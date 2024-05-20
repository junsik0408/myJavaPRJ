class  Car {
    int speed;
    String color;

    void car1 (int speed,String color){
        this.speed = speed;
        this.color = color;


    }

}

 class sportcar extends Car{
     @Override
     void car1(int speed, String color) {
         super.car1(speed, color);

         this.speed = speed + 50;

     }
 }
 public class P0520_1 {
     public static void main(String[] args) {
         Car sonata = new Car();
         sportcar porsche = new sportcar();

         sonata.car1(100,"노란색");
         porsche.car1(100,"노란색");
         System.out.println(porsche.speed);


     }
}
