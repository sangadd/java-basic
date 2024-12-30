package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("main start"); // 1
        method1(10);
        // 영역 지정 ctrl + w
        System.out.println("main end"); // 6

    }

    static void method1(int m1){
        System.out.println("method1 start"); // 2
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end"); // 5
    }

    static void method2(int m2){
        System.out.println("method2 start"); // 3
        System.out.println("method2 end"); // 4
    }
    
    /*
    정리
    1. 자바는 스택 영역을 사용해서 메서드 호출과 지역 변수 (매개변수 포함)를 관리한다.
    2. 메서드를 계속 호출하면 스택 프레임이 계속 쌓인다.
    3. 지역 변수 (매개변수 포함)는 스택 영역에서 관리한다.
    4. 스택 프레임이 종료되면 지역 변수도 함께 제거된다.
    5. 스택 프레임이 모두 제거되면 프로그램도 종료됨
    */
}
