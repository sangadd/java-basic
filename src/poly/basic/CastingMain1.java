package poly.basic;

public class CastingMain1 {
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
        // 다운캐스팅 덕분에 child.childMethod()를 호출할 수 있게 됨
        // 이 메서드를 호출하기 위해 해당 인스턴스를 찾아간 다음 Child 타입을 찾는다.
        // Child 타입에는 childMethod()가 있으므로 해당 기능을 호출할 수 있다.

        // 근데 다음과 같은 문제에 봉착한다 ㅠㅠ

        // 부모는 자식을 담을 수 있지만 자식은 부모를 담을 수 없다.
        Parent parent = new Child(); // 부모는 자식을 담을 수 있다.
        Parent parent1 = child; // Child child 변수 : 부모는 자식을 담을 수 있다.

        /*
        * 반면에 다음과 같은 자식은 부모를 담을 수 없다.
        * Child child = poly; // Parent poly 변수
        * 이건 부모 타입을 사용하는 변수를 자식 타입에 대입하려고 하면 컴파일 오류 발생 -> 자식은 부모를 담을 수 없어
        * 이때는 다운캐스팅이라는 기능을 사용해서 부모 타입을 잠깐 자식 타입으로 변경하면 된다.
        *
        * Child child = (Child) poly;
        * 이렇게 (타입) 처럼 괄호와 그 사이에 타입을 지정하면 참조 대상을 특정 타입으로 변경할 수 있다.
        * 이렇게 특정 타입으로 변경하는 것을 캐스팅이라 한다.
        *
        * 오른쪽에 있는 (child) poly 코드에서 poly는 Parent 타입이다.
        * 이 타입을 (child)를 사용해서 일시적으로 자식 타입인 child 타입으로 변경한다.
        * 그리고 나서 왼쪽에 있는 Child child에 대입한다.
        *
        * */

        /*
        실행 순서
        Child child = (Child) poly; // 다운캐스팅을 통해 부모타입을 자식 타입으로 변환한 다음에 대입 시도
        Child child = (Child) x001; // 참조값을 읽은 다음 자식 타입으로 지정
        Child child = x001; // 최종 결과

        => 참고로 캐스팅을 한다고 해서 Parent poly의 타입이 변하는 것은 아니다.
        해당 참조값을 꺼내고 꺼낸 참조값이 Child 타입이 되는 것이다.
        따라서 poly 타입은 Parent로 기존과 같이 유지된다.
        */

        /*
        캐스팅
        1. 업캐스팅(upcasting) : 부모 타입으로 변경
        2. 다운캐스팅(downcasting) : 자식 타입으로 변경

        캐스팅 용어
        캐스팅은 영어 단어인 cast 에서 유래됨 cast는 금속이나 다른 물질을 녹여서 특정한 형태나 모양으로 만드는 과정을 의미한다.
        Child child = (Child) poly 경우 Parent poly라는 부모 타입을 Child라는 자식 타입으로 변경했다
        */
    }
}
