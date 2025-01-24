package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {

        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 런타입 오류 - ClassCastException
        child2.childMethod();  // 실행 불가

        /*
        코드 분석

        Parent parent2 = new Parent();
        먼저 new Parent()로 부모 타입으로 객체를 생성한다.
        따라서 메모리 상에 자식 타입은 전혀 존재하지 않음
        생성 결과를 parent2에 담아두고 이 경우 같은 타입이므로 문제가 발생하지 않음

        Child child2 = (Child) parent2;
        다음으로 parent2를 Child 타입으로 다운캐스팅한다.
        그런데!!! parent2는 Parent로 생성이 되었다.
        따라서 메모리 상에는 Child 자체가 존재하지 않는다. Child 자체를 사용할 수 있는 것이다.

        자바에서 이렇게 사용할 수 없는 타입으로 다운캐스팅하는 경우에 ClassCastException 이라는 예외를 발생시킨다.
        예외가 발생하면 다음 동작이 실행되지 않고 프로그램이 종료된다.
        따라서 child2.childMethod();  코드 자체 실행 X
        */

        // 업캐스팅이 안전하고 다운캐스팅이 위험한 이유 다형성.md 파일로 정리해둠
    }
}
