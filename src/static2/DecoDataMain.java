package static2;

import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall(); // 만약  DecoData.staticCall() 이 코드가 DecoDataMain 클래스 안에 여러 곳에서 사용한다면 alt + enter 누르면 staticCall(); 이렇게 변경됨
        // 그리고 import 가 생김

        System.out.println("2. 인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출");
        DecoData data2 = new DecoData(); // 인스턴스는 다시 생성되니까 1 이고
        data2.instanceCall(); // static은 이어서 호출하니까 ++ 하니까 3이 됨

        staticCall(data1);

        // 추가
        // 인스턴스를 통한 접근
        DecoData decoData = new DecoData();
        decoData.staticCall();
        // 정적 메서드의 경우 인스턴스를 통한 접근은 추천하지 않음 왜냐하면 코드를 읽을 때 마치 인스턴스 메서드에 접근하는 것처럼 오해할 수 있기 떄문

        // 클래스를 통한 접근
        staticCall();
        // 정적 메서드는 클래스에서 공용으로 관리하기 떄문에 클래스를 통해서 접근하는 것이 더 명확함 따라서 정적 메서드에 접근할 때는 클래스를 통해서 접근하자!
    }
}
