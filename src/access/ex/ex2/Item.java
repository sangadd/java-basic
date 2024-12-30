package access.ex.ex2;

public class Item {
    private String name; // 상품명
    private int price; // 상품 가격
    private int quantity; // 상품 수량

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // 출력코드에서 상품명 출력해야함 
    public String getName() {
        return name;
    }

    // 출력코드에서 합계 계산해야함
    public int getTotalPrice() {
        return price * quantity;
    }
}
