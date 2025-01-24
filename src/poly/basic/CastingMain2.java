package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();

        // 단, 자식의 기능은 호출 불가능 : 컴파일 오류 발생
        // poly는 Parent 타입이니까!
//        poly.childMethod();

        //  다운캐스팅 (부모 타입 -> 자식 타입)
        // 호출하는 타입을 자식인 Child 타입으로 변경하면 인스턴스의 Child에 있는 childMethod()를 호출할 수 있다
        Child child = (Child) poly; // x001
        child.childMethod();

        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();
        /*
        * 어떤 방식이냐면
        poly는 Parent 타입이다. 그런데 이 코드를 실행하면 Parent 타입을 임시로 Child로 변경한다.
        그리고 메서드를 호출할 때 Child 타입에서 찾아서 실행한다.
        *
        정확히는 poly가 Child 타입으로 바뀌는 것은 아니다.
        * ((Child) poly).childMethod();
        * ((Child) x001).childMethod();
        참고로 캐스팅을 한다고 해서 Parent poly의 타입이 변하는 것은 아니다.
        해당 참조값을 꺼내고 참조값이 Child 타입이 되는 것이다.

        따라서 poly의 타입은 Parent로 그대로 유지된다.

        이렇게 일시적 다운캐스팅을 사용하면 별도의 변수 없이 인스턴스의 자식 타입의 기능을 사용할 수 있다.
        */

    }
}
