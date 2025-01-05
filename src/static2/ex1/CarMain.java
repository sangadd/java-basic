package static2.ex1;

public class CarMain {
    public static void main(String[] args) {
        // 생성자랑 메서드는 alt + enter 를 통해 자동생성 가능
        Car car1 = new Car("K3");
        Car car2 = new Car("G80");
        Car car3 = new Car("Model Y");

        Car.showTotalCars();
    }
}
