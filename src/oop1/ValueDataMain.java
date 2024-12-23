package oop1;

public class ValueDataMain {
    public static void main(String[] args) {

        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);

        System.out.println("최종 숫자: " + valueData.value);
    }

    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("숫자 증가" + valueData.value);
    }

    // 이건 절차지향
    // 자바 같은 객체 지향 언어는 클래스 내부에 속성(데이터)과 기능(메서드)을 함께 포함할 수 있다.
    // 클래스 내부에 멤버 변수 뿐만 아니라 메서드도 함께 포함할 수 있다는 뜻
}
