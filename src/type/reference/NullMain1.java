package type.reference;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data); // null

        data = new Data(); // Data 객체 생성해서 그 참조값을 data변수에 할당해줌 그럼 이제 data 변수가 참조할 객체가 존재한다.
        System.out.println("2. data = " + data); // type.reference.Data@1d81eb93

        data = null; // 다시 data에 null 할당
        System.out.println("3. data = " + data); // null

        /*
        * GC (가비지 컬렉션)
        * 이건 아무도 참조하지 않는 인스턴스의 최후
        *
        * data에 null을 할당했다. 따라서 앞서 생성한 x001 Data 인스턴스를 더는 아무도 참조하지 않는다.
        * 이렇게 아무도 참조하지 않게 되면 x001이라는 참조값을 다시 구할 방법이 없다. 따라서 해당 인스턴스에 다시 접근할 방법이 없다.
        *
        * 이렇게 아무도 참조하지 않는 인스턴스는 사용되지 않고 메모리 용량만 차지할 뿐임
        * C와 같은 과거 프로그래밍 언어는 개발자가 직접 명령어를 사용해서 인스턴스를 매모리에서 제거해야 했다.
        * 만약 실수로 인스턴스 삭제를 누락하면 메모리에 사용하지 않는 객체가 가득해져서 메모리 부족 오류가 발생하게 된다.
        *
        * 자바는 이런 과정을 자동으로 처리해준다.
        * 아무도 참조하지 않는 인스턴스가 있으면 JVM의 CG가 더이상 사용하지 않는 인스턴스라 판단하고 해당 인스턴스를 자동으로 메모리에서 제거해줌
        *
        *   JVM = Java Virtual Machine(자바 가상 머신)은 Java로 개발한 프로그램을 컴파일하여 만들어지는 바이트코드를 실행시키기 위한 가상머신
        *
        * 객체는 해당 객체를 참조하는 곳이 있으면 JVM이 종료할 떄까지 계속 생존한다.
        * 그런데 중간에 해당 객체를 참조할 곳이 모두 사라지면 그떄 JVM을 필요 없는 객체로 판단하고 GC를 사용해서 제거함
        */
    }
}
