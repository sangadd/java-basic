package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child(); // (1) child 변수는 Child 타입이니까

        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);

        child.method();

        // (2) child.value와 child.method(); 를 호출하면 인스턴스의 Child 타입에서 기능을 찾아서 실행할거지

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent(); // (3) parent 변수는 Parent 타입이니까

        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);

        parent.method();

        // (4) parent.value와 parent.method(); 를 호출하면 인스턴스의 Parent 타입에서 기능을 찾아서 실행할거지


        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();

        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); // value = parent (변수는 오버라이딩X)

        poly.method(); // Child.method 로 결과가 나왔는데 왜??????? 메서드는 오버라이딩이 됨!

        /*
        * 중요한 설명
        *
        * poly 변수는 Parent 타입이다.
        * 따라서 poly.value와 poly.method() 를 호출하면 인스턴스의 Parent 타입에서 기능을 찾아서 실행한다.
        *
        * poly.value 는 Parent 타입에 있는 value 값을 읽고
        * poly.method() 는 Parent 타입에 있는 method() 를 실행하려고 한다.
        *
        * 그런데 하위 타입인 Child.method()가 오버라이딩 되어 있다.
        * 오버라이딩 된 메서드는 항상 우선권을 가진다!!
        * 따라서 Parent.method()가 아니라 Child.method()가 실행된다.
        *
        * ------
        *
        * 오버라이딩 된 메서드는 항상 우선권을 가진다.
        * 오버라이딩은 부모 타입에서 정의한 기능을 자식 타입에서 재정의하는 것이다.
        *
        * 만약 자식에서도 오버라이딩을 하고 손자에서도 같은 메서드를 오버라이딩하면 손자의 오버라이딩 메서드가 우선권을 가진다.
        *
        * 더 하위 자식의 오버라이딩 된 메서드가 우선권을 가지는 것이다.
        *
        * ------
        *
        * 다형성을 이루는 핵심 이론인 다형적 참조와 메서드 오버라이딩을 배웠다!
        * - 다형적 참조 : 하나의 변수 타입으로 다양한 자식 인스턴스를 참조할 수 있는 기능
        * - 메서드 오버라이딩 : 기존 기능을 하위 타입에서 새로운 기능으로 재정의
        */


    }
}
