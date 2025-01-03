package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello";
        String deco = DecoUtil2.deco(s);
        /*
        * static이 붙은 정적 메서드는 객체 생성 없이 클래스명 + . + 메서드 명으로 바로 호출 가능
        * 정적 메서드 덕분에 불필요한 객체 생성 없이 편리하게 메서드 사용했다.
        */

        System.out.println(s);
        System.out.println(deco);

        /*
        * 1. 클래스 메서드
        * 메서드 앞에서 static을 붙을 수 있다. 이것을 정적 메서드 또는 클래스 메서드라고 한다.
        * 정적 메서드라는 용어는 static이 정적이라는 뜻이기 떄문이고
        * 클래스 메서드라는 용어는 인스턴스 생성 없이 마치 클래스에 있는 메서드를 바로 호출하는 것처럼 느껴지기 떄문이다.
        *
        *
        * 2. 인스턴스 메서드
        * static이 붙지 않은 메서드는 인스턴스를 생성해야 호출할 수 있다. 이것을 인스턴스 메서드라고 한다.
        */
    }
}
