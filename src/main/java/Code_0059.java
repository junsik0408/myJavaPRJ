import java.util.Scanner;

public class Code_0059 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 상품 정보
            String productName = "무선 이어폰";
            int productStock = 5;  // 재고 수량
            double productPrice = 100.0;  // 상품 가격
            boolean hasDiscountCoupon = true;  // 할인 쿠폰 여부

            // 사용자 정보
            String paymentMethod;
            boolean isPremiumMember = false;  // 프리미엄 회원 여부

            // 주문 처리
            System.out.println("상품: " + productName + " / 가격: " + productPrice + " / 재고: " + productStock);
            System.out.println("결제 방식을 선택하세요 (1: 신용카드, 2: PayPal, 3: 가상화폐): ");
            int paymentChoice = scanner.nextInt();

            // 결제 방식 결정
            if (paymentChoice == 1) {
                paymentMethod = "Credit Card";
            } else if (paymentChoice == 2) {
                paymentMethod = "PayPal";
            } else if (paymentChoice == 3) {
                paymentMethod = "Cryptocurrency";
            } else {
                System.out.println("유효하지 않은 결제 방식입니다. 프로그램을 종료합니다.");
                return;
            }

            // 주문 수량 입력
            System.out.println("주문할 수량을 입력하세요:");
            int orderQuantity = scanner.nextInt();

            // 재고 확인 및 주문 처리
            if (orderQuantity > productStock) {
                System.out.println("재고가 부족합니다. 주문이 취소되었습니다.");
            } else {
                productStock -= orderQuantity;
                double totalPrice = productPrice * orderQuantity;

                // 프리미엄 회원은 10% 할인
                if (isPremiumMember) {
                    totalPrice *= 0.9;
                    System.out.println("프리미엄 회원으로 10% 할인이 적용되었습니다.");
                }

                // 할인 쿠폰 적용
                if (hasDiscountCoupon) {
                    totalPrice *= 0.95;  // 5% 추가 할인
                    System.out.println("할인 쿠폰이 적용되어 5% 할인이 적용되었습니다.");
                }

                // 결제 방식에 따른 수수료 추가
                if (paymentMethod.equals("Credit Card")) {
                    totalPrice += 2.0;  // 신용카드 수수료
                    System.out.println("신용카드 결제 수수료 2.0원이 추가되었습니다.");
                } else if (paymentMethod.equals("PayPal")) {
                    totalPrice += 3.0;  // PayPal 수수료
                    System.out.println("PayPal 결제 수수료 3.0원이 추가되었습니다.");
                } else if (paymentMethod.equals("Cryptocurrency")) {
                    totalPrice += 5.0;  // 가상화폐 결제 수수료
                    System.out.println("가상화폐 결제 수수료 5.0원이 추가되었습니다.");
                }

                // 주문 최종 확인
                System.out.println("최종 결제 금액: " + totalPrice + "원");
                System.out.println("결제 방식을 통해 결제가 완료되었습니다: " + paymentMethod);

                // 포인트 적립
                if (isPremiumMember) {
                    System.out.println("프리미엄 회원에게 10포인트가 적립되었습니다.");
                } else {
                    System.out.println("일반 회원에게 5포인트가 적립되었습니다.");
                }

                // 재고 상태 출력
                System.out.println("남은 재고: " + productStock + "개");
            }

            scanner.close();
        }
    }
