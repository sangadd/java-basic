package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(){
        // super(); 라고 쓰면 오류남 왜냐하면 ClassB에서 생성자를 정의해줬으므로 자바에서 기본 생성자인
        // public ClassB(){} 를 자동으로 생성안해줌 그래서 파라미터 값을 넘겨줘야함
        super(10, 20 );
        // ClassC는 ClassB를 상속 받았다. 근데 ClassB에는 두 개의 생성자가 있는데 하나만 호출할 수 있다. 그래서 ClassB(int a, int b) 생성자 선택
        System.out.println("ClassC 생성자");
    }
}
