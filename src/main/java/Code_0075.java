import java.util.Scanner;

public class Code_0075 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자판기 메뉴:");
        System.out.println("1. 커피 - 2000원");
        System.out.println("2. 녹차 - 2500원");
        System.out.println("3. 핫초코 - 3000원");
        System.out.print("메뉴 번호를 선택하세요 (1~3): ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("커피를 선택하셨습니다. 가격은 2000원입니다.");
        } else if (choice == 2) {
            System.out.println("녹차를 선택하셨습니다. 가격은 2500원입니다.");
        } else if (choice == 3) {
            System.out.println("핫초코를 선택하셨습니다. 가격은 3000원입니다.");
        } else {
            System.out.println("잘못된 선택입니다. 메뉴 번호는 1, 2, 3 중에서 선택하세요.");
        }

        // 음료 온도 선택 추가
        if (choice >= 1 && choice <= 3) {
            System.out.print("음료 온도를 선택하세요 (1. 뜨거운 / 2. 차가운): ");
            int temperature = scanner.nextInt();

            if (temperature == 1) {
                System.out.println("뜨거운 음료로 준비됩니다.");
            } else if (temperature == 2) {
                System.out.println("차가운 음료로 준비됩니다.");
            } else {
                System.out.println("잘못된 선택입니다. 기본적으로 뜨거운 음료로 제공됩니다.");
            }
        }

        // 결제 방법 선택
        if (choice >= 1 && choice <= 3) {
            System.out.print("결제 방법을 선택하세요 (1. 카드 / 2. 현금): ");
            int payment = scanner.nextInt();

            if (payment == 1) {
                System.out.println("카드 결제가 완료되었습니다. 감사합니다.");
            } else if (payment == 2) {
                System.out.println("현금 결제가 완료되었습니다. 감사합니다.");
            } else {
                System.out.println("잘못된 선택입니다. 결제 오류입니다.");
            }
        }

        scanner.close();
    }
}
