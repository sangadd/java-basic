package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 전기차를 빠르게 이동합니다.

        GasCar gasCar = new GasCar();
        gasCar.move(); // 차를 이동합니다.

        // 이렇게 두 클래스 다 부모 Car의 move() 메서드를 가져왔는데
        // ElectricCar에서는 재정의를 해서 다르게 출력됨
    }
}
