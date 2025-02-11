package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        // (1) Child와 InterfaceB 둘 다 메모리상에 만들어졌을거고 InterfaceB로 가보면
        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
