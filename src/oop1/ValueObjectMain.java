package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {

        // 이 클래스에서 valueData 객체를 생성했으니 그 안에 멤버변수(필드, 전역변수)와 메서드 둘 다 사용 가능!
        ValueData valueData = new ValueData();

        valueData.add();
        valueData.add();
        valueData.add();

        System.out.println("최종 숫자: " + valueData.value);

        /*
        * 위 코드 해석
        valueData.add(); // 1번
        x002.add(); // 2번 ==> ValueData 인스턴스 안에 있는 add() 메서드를 호출한다.
        3번 add() 메서드를 호출하면 메서드 내부에서 value++을 호출하게 된다. 이때 value에 접근해야 하는데,
        기본적으로 본인 인스턴스에 있는 멤버 변수에 접근한다. 본인 인스턴스가 x002 참조값을 사용하므로 자기 저신인 x002.value에 접근하게 된다.
        4번 ++ 연산으로 value의 값을 하나 증가시킴
        */

        /*
        * 정리
        클래스는 속성(데이터, 멤버 변수)과 기능(메서드)을 정의할 수 있다.
        객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근할 수 있다.
            객체의 메서드 내부에서 접근하는 멤버 변수는 객체 자신의 멤버 변수이다.
        */
    }
}
