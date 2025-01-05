package static2;


import oop1.ValueData;

public class ValueDataMain {
    /*
    main() 메서드는 정적 메서드
    인스턴스 생성 없이 실행하는 가장 대표적인 메서드가 바로 main() 메서드이다.
    main() 메서드는 프로그램을 시작하는 시작점이 되는데 생각해보면 객체를 생성하지 않아도 main() 메서드가 작동했다!
    이것은 main() 메서드가 static 이기 떄문이다.

    정적 메서드는 정적 메서드만 호출할 수 있다.
    따라서 정적 메서드인 main()이 호출하는 메서드에는 정적 메서드를 사용했다.
    물론 더 정확히 말하자면 정적 메서드는 같은 클래스 내부에서 정적 메서드만 호출할 수 있다.
    따라서 정적 메서드인 main() 메서드가 같은 클래스에서 호출하는 메서드도 정적 메서드로 선언해서 사용했다.
    */
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
    }

    // 위에 main 메서드가 static이니까 add 메서드도 static 써줘야함 아니면 인스턴스 생성해서 불러와야하기 때문
    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println(valueData.value);
    }
}
