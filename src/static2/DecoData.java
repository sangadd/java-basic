package static2;

public class DecoData {
    /*
    정적 메서드는 객체 생성 없이 클래스에 있는 메서드를 바로 호출할 수 있다는 장점이 있다.
    하지만! 정적 메서드는 언제나 사용할 수 있는 것은 아니다

    < 정적 메서드 사용법 >
    1. static메서드는 static만 사용 가능
        클래스 내부의 기능을 사용할 때 정적 메서드는 static이 붙은 정적 메서드나 정적 변수만 사용 할 수 있다.
        클래스 내부의 기능을 사용할 때 정적 메서드는 인스턴스 변수나 인스턴스 메서드를 사용할 수 없다.
    2. 반대로 모든 곳에서 static을 호출할 수 있다.
        정적 메서드는 공용 기능이다. 따라서 접근 제어만 허락한다면 클래스를 통해 모든 곳에서 static을 호출할 수 있다.
    */

    private int instanceValue;
    private static int staticValue;

    // 즉 static은 static에만 접근 가능
    public static void staticCall(){
        // 이 메서드는 클래스 안에 있으니까 아래 변수와 메서드 호출 가능
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근

        // 근데 instanceValue 변수와 instanceMethod() 메서드는 접근 불가능
//        instanceValue++;  인스턴스 변수 접근, compile error
//        instanceMethod(); 인스턴스 메서드 접근, compile error

        /*
        * 왜 접근이 불가능하냐
        정적 메서드가 인스턴스의 기능을 사용할 수 없는 이유는
        정적 메서드는 클래스의 이름을 통해 바로 호출할 수 있다.
        그래서 인스턴스처럼 참조값의 개념이 없다.
        특정 인스턴스의 기능을 사용하려면 참조값을 알아야 하는데!!!!  정적 메서드는 참조값이 없이 호출한다.
        따라서 정적 메서드 내부에서 인스턴스 변수나 인스턴스 메서드를 사용할 수 없다.
        */
    }

    // 즉 인스턴스는 모든 것에 다 접근 가능
    public void instanceCall(){
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod();;// 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근

        /*
        * DecoData.staticValue++;
        * DecoData.staticMethod();
        * 이건데 생략된거임
        */
    }

    // 하지만 객체의 참조값을 직접 매개변수로 전달하면 정적 메서드도 인스턴스 변수나 메서드를 호출할 수 있다!
    public static void staticCall(DecoData decoData){
        decoData.instanceValue++;
        decoData.instanceMethod();
    }

    private void instanceMethod(){
        System.out.println("instanceValue" + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue" + staticValue);
    }

}
