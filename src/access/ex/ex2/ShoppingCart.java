package access.ex.ex2;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        // 검증 로직 
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다");
            return;
        }

        // 실행 로직
        items[itemCount] = item; // 처음에 itemCount의 초기값이 0이니까 0번에다가 둠
        itemCount++;
    }

    public void displayItem() {
        System.out.println("장바구니 상품 출력");

        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + " 합계:" + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    // 이 메서드 내부에서만 사용되므로 private 접근 제어자 사용함
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            // ctrl + alt + v 누르면 변수 추출
            Item item = items[i];
            totalPrice = totalPrice + item.getTotalPrice();
        }
        return totalPrice;
    }
}
