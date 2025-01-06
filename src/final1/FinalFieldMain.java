package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);

        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        /* 정리
        * ConstructInit과 같이 생성자를 사용해서 final 필드를 초기화하는 경우
        * 각 인스턴스마다 final 필드에 다른 값을 할당할 수 있다.
        * 물론 final을 사용했기 때문에 생성 이후에 이 값을 변경하는 것은 절대 불가능
        */

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();

        System.out.println(fieldInit1.value); // 이미 초기값이 들어가있으니 값 변경 불가능함 -> 그래서 다 10나옴
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        /* 정리
        * FieldInit와 같이 final 필드를 필드에서 초기화 하는 경우,
        * 모든 인스턴스가 같은 값을 가진다. (value = 10 이렇게!)
        * 왜냐하면 생성자 초기화와 다르게 필드 초기화는 필드의 코드에 해당 값이 미리 정해져 있기 때문!!!
        *
        * 모든 인스턴스가 같은 값을 사용하기 떄문에 메모리 낭비 ㅠㅠ
        * 또 같은 값을 계속 생성되는 것은 개발자가 보기에 명확한 중복임 이럴떄 사용하면 좋은 것이 static 이다
        */

        // 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);

        /* 정리
        * static.final
        * FieldInit.CONST_VALUE 이건 static 영역에 존재한다. 그리고 final 키워드를 사용해서 초기값이 변하지 않는다.
        * static 영역은 단 하나만 존재하는 영역이다.
        * 그래서 필드에 final + 필드 초기화를 사용하는 경우에는 static을 붙여서 사용하는 것이 효과적임
        */

    }
}
