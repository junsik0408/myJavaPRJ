class Sasin{
    int cp;
    String item;

    void setlol(int cp,String item){
        this.cp = cp;
        this.item = item;
    }
}
class Yone extends Sasin{
    @Override
    void setlol(int cp, String item) {
        super.setlol(cp, item);
        this.cp = cp + 1;
    }
}
public class P0520 {
    public static void main(String[] args) {
        Sasin lolc = new Sasin();
        Yone lolc2 = new Yone();
        lolc.setlol(8,"검");
        lolc2.setlol(8,"검");
        System.out.println(lolc.cp + "\n" +lolc.item);
        System.out.println(lolc2.cp + " " + lolc2.item);
    }
}
