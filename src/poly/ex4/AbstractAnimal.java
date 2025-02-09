package poly.ex4;

/*
* 순수 추상 클래스는 모든 메서드가 추상 메서드인 추상 클래스
*
* 앞서 만든 예제에서 move()도 추상 메서드로 만들어야한다고 가정
* 이 경우 AbstractAnimal 클래스의 모든 메서드가 추상 메서드가 된다. 이런 클래스를 순수 추상 클래스라 한다.
* */
public abstract class AbstractAnimal {
    public abstract void sound();
    public abstract void move();
}
