package access.ex.ex2;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        // 먼저 Item 클래스에서 생성자 생성해야함
        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        // 2. 메서드 생성하기
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        // alt + enter 누르면 메서드 생성해줌
        shoppingCart.displayItem();
    }
}
