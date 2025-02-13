package poly.car0;

/*
* 다형성 - 역할과 구현 예제1
*
* 간단한 운전자와 자동차의 관계를 개발해보자
* 먼저 다형성을 사용하지 않고 역할과 구현을 분리하지 않고 단순하게 개발하자
*/
public class K3Car {
    // 엔진 시작
    public void startEngine(){
        System.out.println("K3Car.startEngin");
    }

    // 엔진 끄기
    public void offEngine(){
        System.out.println("K3Car.offEngine");
    }

    // 엑셀 밟기
    public void pressAccelerator(){
        System.out.println("K3Car.pressAccelerator");
    }
}
