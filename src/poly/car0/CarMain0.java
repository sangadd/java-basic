package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();

        // 추가
        ModelK3Car modelK3Car = new ModelK3Car();
        driver.setK3Car(null);
        driver.setModelK3Car(modelK3Car);
        driver.drive();
        /*
        * k3를 운전하던 운전자가 Model3로 차량을 변경해서 운전하는 코드다
        * driver.setK3Car(null); 을 통해 K3Car의 참조를 제거한다.
        * driver.setModelK3Car(modelK3Car);를 통해서 새로운 model3Car의 참조를 추가한다.
        * driver.drive();를 호출한다. */
    }
}
