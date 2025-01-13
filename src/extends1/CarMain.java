package extends1;

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
     전기차는 이동(move()), 충전(charge()) 기능이 있고
     가솔린차는 이동(move()), 주유(fillUp()) 기능이 있다.

     전기차와 가솔린차는 자동차의 좀 더 구체적인 개념이다.
     반대로 자동차는 전기차와 가솔린차를 포함하는 추상적인 개념이다.
     그래서 잘 보면 둘의 공통 기능이 이동(move())이 있다.
     */
}
