package type.reference.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력 : ");
        int n = scanner.nextInt(); // 여기서 숫자 입력 후 엔터 누르면 빈값으로 인식되어서 아래 코드 작성해야함
        scanner.nextLine();

        ProductOrder[] productOrders = new ProductOrder[n];
        for (int i = 0; i < productOrders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();

            scanner.nextLine(); // 입력 버퍼를 비우기 위한 코드

            productOrders[i] = createOrder(productName, price, quantity);
        }

        printOrders(productOrders);
//       getTotalAmount(productOrders); 이거 ctrl + Alt + v  누르면 아래 코드 생성 (int 반환 타입이 있으니까)
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] productOrders){
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + " 가격: " + productOrder.price + " 수량: " + productOrder.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders){
        int totalAmount = 0;
        for (ProductOrder productOrder : productOrders){
            totalAmount = totalAmount + productOrder.price * productOrder.quantity;
        }
        return totalAmount;
    }
}
