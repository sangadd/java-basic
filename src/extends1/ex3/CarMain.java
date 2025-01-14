package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.fillHydrogen();
        hydrogenCar.move();
        hydrogenCar.openDoor();
    }

    // 부모인 Car에 추가했는데 자식들 다 사용할 수 있는 혜택이 주어진겨
    // 상속 관계 덕분에 중복은 줄어들고 새로운 수소차를 편리하게 확장(extend)한 것을 알 수 있다.
}
