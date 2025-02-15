package poly.car0;

public class Driver {
    public K3Car k3Car;
    public ModelK3Car modelK3Car; // 추가

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    // 추가 (set 이라고 치기만 해도 다 생성해줌)
    public void setModelK3Car(ModelK3Car modelK3Car) {
        this.modelK3Car = modelK3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");

        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.offEngine();
            k3Car.pressAccelerator();
        } else if (modelK3Car != null) {
            modelK3Car.startEngine();
            modelK3Car.pressAccelerator();
            modelK3Car.offEngine();
        }

    }
}
