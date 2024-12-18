package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrder = new ProductOrder[3];

        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;

        productOrder[0] = productOrder1;
        productOrder[1] = productOrder2;
        productOrder[2] = productOrder3;

        int sum = (productOrder1.price) * productOrder1.quantity + (productOrder2.price) * productOrder2.quantity + (productOrder3.price) * productOrder3.quantity;

        for (ProductOrder productOrder4 : productOrder) {
            System.out.println("상품명: " + productOrder4.productName + "가격: " + productOrder4.price + "수량: " + productOrder4.quantity);
        }
        System.out.println("총 결제 금액: " + sum);

        // 위에는 내가 푼 문제 풀이인데 아래는 강사님 풀이 참고해서 수정해보기

        int totalAmount = 0;
        for (ProductOrder productOrder4 : productOrder) {
            System.out.println("상품명: " + productOrder4.productName + "가격: " + productOrder4.price + "수량: " + productOrder4.quantity);
            totalAmount = totalAmount + productOrder4.price * productOrder4.quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount);

    }
}
