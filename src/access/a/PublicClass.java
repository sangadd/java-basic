package access.a;

public class PublicClass { // 클래스 레벨
    public static void main(String[] args) {
        /*
        클래스 레벨의 접근 제어자 규칙

        - 클래스 레벨의 접근 제어자는 public 과 default 만 사용 가능
           private, protected 는 사용 불가능

        - public 클래스는 반드시 파일명과 이름이 같아야 한다.
            하나의 자바 파일에 public 클래스는 하나만 등장할 수 있다.
            하나의 자바 파일에 default 접근 제어자를 사용하는 클래스는 무한정 만들 수 있다.
       */

        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();


    }
}

// 아래 두 클래스는 접근 제어자가 default 이기 때문에 같은 패키지 내부에서만 접근 가능
class DefaultClass1 {

}

class DefaultClass2 {

}
