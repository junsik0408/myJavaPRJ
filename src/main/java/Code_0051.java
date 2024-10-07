public class Code_0051 {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("성인입니다. 신분증을 확인했습니다.");
            } else {
                System.out.println("성인이지만 신분증이 없습니다.");
            }
        } else {
            System.out.println("미성년자입니다.");
        }
    }
}
