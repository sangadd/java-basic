package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(); // 1. method1() 메서드 호출
        System.out.println("main end");

    }

    static void method1(){
        System.out.println("method1 start");
        Data data1 = new Data(10); // 2. 객체 생성
        method2(data1); // 3. 참조값을 method2에 넘겨줌
        System.out.println("method1 end");
    }

    static void method2(Data data2){ // 4. 파라미터로 참조값 받기
        System.out.println("method2 start");
        System.out.println("data.value의 값은?" + data2.getValue()); // 5. 호출
        System.out.println("method2 end");
    }

    // 지역 변수는 스택 영역에, 객체(인스턴스)는 힙 영역에서 관리되는 것을 확인했음
    // 메서드 영역이 관리하는 변수도 있다 근데 이걸 이해하기 위해서는 static 키워드를 알아야함 (다음 강의)
}
