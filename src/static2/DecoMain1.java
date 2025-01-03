package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello";
        DecoUtil1 decoUtil1 = new DecoUtil1();
        // decoUtil1.deco(s); 처음에 이 코드에서 단축키 ctrl + alt + v를 누르면
        // 아래처럼 됨
        String deco = decoUtil1.deco(s);

        System.out.println(s);
        System.out.println(deco);

        /*
        deco() 메서드를 호출하기 위해서는 DecoUtil1의 인스턴스를 먼저 생성해야한다.
        그런데 deco() 기능은 멤버 변수도 없고 단순히 기능만 제공한다

        인스턴스가 필요한 이유는 멤버 변수(인스턴스 변수)등을 사용하는 목적이 큰데
        이 ㅁ[서드는 사용하는 인스턴스 변수도 없고 단순히 기능만 제공한다
        */
    }
}
