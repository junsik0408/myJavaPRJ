public class Code_0000 {
    public static void main(String[] args) {
        for(int i=6; i>0; i--){
            for (int j=6-i;j>0; j--){
                System.out.print(" ");
            }
            for(int k=i*2-1; k>0;k--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
