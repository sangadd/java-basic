package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        GasCar gasCar = new GasCar();

        electricCar.move();
        electricCar.charge();
        gasCar.move();
        gasCar.fillUp();
    }

    /*
    상속은 부모의 기능을 자식이 물려 받는 것이다.
    따라서 자식이 부모의 기능을 물려 받아서 사용할 수 있다.

    반대로 부모 클래스는 자식 클래스에 접근 XXX
    자식 클래스는 부모 클래스의 기능을 물려 받기 때문에 접근 가능이지만 그 반대는 X

    부모 코드에서 자식에 대한 정보 X
    자식 코드는 extends Car를 통해 부모를 알 수 있다.
    */

    /*
    <<<단일 상속>>>
    자바는 다중 상속을 지원하지 않음 그래서 extend 대상은 하나만 선택 가능
    부모를 하나만 선택할 수 있다는 소리임
    물론~ 부모가 또 다른 부모를 가지는 것은 괜찮음
    */

    // 상속이랑 인터페이스 차이 알아두기 !!! 중요 🍎
}
