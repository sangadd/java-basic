package extends1.overriding;

public class Car {
    /*
    상속과 메서드 오버라이딩

    부모 타입의 기능을 자식에서는 다르게 재정의 하고 싶을 때가 있다.
    예를 들어서 자동차의 경우, Car.move()라는 기능이 있다.
    이 기능을 사용하면 단순히 차를 이동합니다 라고 출력한다.
    전기차의 경우 보통 더 빠르기 떄문에 전기차가 move()를 호출한 경우에는 전기차를 빠르게 이동합니다 라고 출력을 변경하고 싶다.

    이렇게 부모에게서 상속 받은 기능을 자식이 재정의 하는 것을 메서드 오버라이딩(Overriding)이라 한다.
    */

    public void move(){
        System.out.println("차를 이동합니다.");
    }

    // 추가
    public void openDoor(){
        System.out.println("문을 엽니다.");
    }
}
