package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.prentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.prentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 부모 타입은 자식을 참조 할 수 있다
        poly.prentMethod();

        /*
            이렇게 부모는 자식을 담을 수 있다.
            Parent poly는 부모 타입이다. new Child()를 통해 생성된 결과는 Child 타입이다.

            자바에서 부모 타입은 자식 타입을 담을 수 있다.
            Parent poly = new Child() : 성공

            반대로 자식 타입은 부모 타입을 담을 수 없다.
            Child child1 = new Parent() : 컴파일 오류 발생
        */

        // 자식의 기능은 호출할 수 없다.
//        poly.childMethod(); 오류 발생 : 부모 타입은 부모 타입 안에 있는 메서드만 호출 가능

        // 그럼 왜 다형적 참조를 하는거지?

        /*
        * 다형적 참조
        *
        * 지금까지 학습한 내용들은 항상 같은 타입에 참조를 했다. 그래서 보통 한 가지 형태만 참조할 수 있다.
        * ex
        * Parent parent = new Parent();
        * Child child = new Child();
        *
        * 그런데 Parent 타입의 변수는 다음과 같이 자신인 Parent는 물론이고 자식 타입까지 참조할 수 있다.
        * 만약 손자가 있다면 손자도 그 하위 타입도 참조할 수 있다.
        * ex
        * Parent poly = new Parent();
        * Parent poly = new Child();
        * Parent poly = new Grandson() : Child 하위에 손자가 있다면 가능 !

        * 이렇게 자바에서 부모 타입은 자신은 물론이고 자신을 기준으로 모든 자식 타입을 참조할 수 있다.
        * 이것이 바로 다양한 형태를 참조할 수 있다고 해서 다형적 참조라 한다
        */

        // 근데 참조만 해도 그 자식들 메서드 못쓰는데 왜 쓰는거지 ?

        /*
        * 다형적 참조의 한계
        *
        * Parent poly = new Child() 이렇게 자식을 참조한 상황에서 poly가 자식 타입인  Child에 있는 ChildMetho()를 호출하면 어떻게 될까?
        * poly.childMethod()를 실행하면 먼저 참조값을 통해 인스턴스를 찾는다.
        * 그리고 다음으로 인스턴스 안에서 실행할 타입을 찾아야한다.
        *
        * 호출자인 poly는 Parent 타입이다. 따라서 Parent 클래스부터 시작해서 필요한 기능을 찾는다.
        * 그런데 상속 관계는 부모 방향으로 찾아 올라갈 수 있지만 자식 방향으로 찾아 내려갈 수는 없다.
        * Parent는 부모 타입이고 상위에 부모가 없다.
        * 따라서 childMethod()를 찾을 수 없으므로 컴파일 오류가 발생한다.
        *
        * 이런 경우 childMethod()를 호출하고 싶으면 어떻게 할까? 바로 캐스팅이 필요하다!!!!!
        *
        * 즉 다향적 참조의 핵심은 부모는 자식을 품을 수 있다는 것이다~
        * 그런데 이런 다형적 참조가 왜 필요하지?라는 의문이 들 수 있다.
        * 이 부분은 다형성의 다른 이론들도 함께 알아야 이해할 수 있다.
        */


    }
}
