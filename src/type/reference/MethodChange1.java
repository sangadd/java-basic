package type.reference;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 a : " + a); // 10
        changePrimitive(a);
        System.out.println("메서드 호출 후 a : " + a); // 10
    }

    static void changePrimitive(int x) {
        x = 20;
    }

    /*
    위에 코드를 분석
    1. 메서드 호출
    int a = 10
    changePrimitive(a);
    여기서 메서드를 호출하고 값 10을 changePrimitive 메서드에 전달함
    즉 메서드를 호출할 떄 매개변수 x에 변수 a의 값을 전달한다는 말임
    따라서 변수 a, x에는 각각 숫자 10을 가지고 있음

    2. 메서드 안에서 값을 변경
    메서드 안에서 x = 20으로 새로운 값을 대입한다.
    결과적으로 x의 값만 20으로 변경되고 a의 값은 10으로 유지됨

    3. 메서드 종료
    메서드 종료 후 값을 확인해보면 a는 10이 출력되고 메서드가 종료되면 매개변수 x는 제거됨
     */
}
