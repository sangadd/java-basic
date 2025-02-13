package poly.car0;

public class Driver {
    public K3Car k3Car;

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        k3Car.startEngine();
        k3Car.offEngine();
        k3Car.pressAccelerator();
    }
}
