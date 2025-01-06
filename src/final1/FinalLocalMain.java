package final1;

public class FinalLocalMain {
    /*
    final 키워드는 이름 그대로 끝!! 이라는 뜻
    변수에 final 키워드가 붙으면 더는 값을 변경할 수 없다.

    참고로 final은 class, method를 포함한 여러 곳에 붙을 수 있다.
    지금은 변수에 붙는 final 키워드를 알아보고 나머지 사용법은 상속 이후에 설명하심
    */

    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10; // 최초 한 번만 할당 가능
//        data1 = 20; // 컴파일 오류 발생함

        // final 지역 변수2
        final int data2 = 10;
//        data2 = 20; // 컴파일 오류
        method(10);
    }

    static void method(final int parameter){
//        parameter = 20; // 파라미터가 위에서 메소드 호출하면서 값을 할당했으니 더이상 값 할당 못하니 컴파일 오류 발생
    }

    /*
    즉 final을 지역 변수에 설정할 경우 최초 한 번만 할당 가능 -> 이후에 변수의 값을 변경하려면 컴파일 오류 발생
    그리고 final을 지역 변수 선언 시 바로 초기화한 경우 이미 값이 할당되었기 때문에 값을 할당할 수 없다.
    매개변수에 final이 붙으면 메서드 내부에서 매개변수의 값을 변경할 수 없다.
    따라서 메서드 호출 시점에 사용된 값이 끝까지 사용된다.*/
}
