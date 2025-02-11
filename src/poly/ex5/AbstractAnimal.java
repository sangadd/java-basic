package poly.ex5;

/*
* AbstractAnimal은 추상 클래스
* sound() : 동물의 소리를 내기 위한 sound() 추상 메서드 제공
* move() : 동물의 이동을 표현하기 위한 메서드이다. 이 메서드는 추상 메서드가 아님 상속을 목적으로 사용됨
* Fly은 인터페이스다 나는 동물은 이 인터페이스를 구현할 수 있다.
*   Bird , Chicken은 날 수 있는 동물이다. fly() 메서드를 구현해야한다.
*/
public abstract class AbstractAnimal {
    public abstract void sound();
    public void move(){
        System.out.println("동물이 이동한다.");
    }
}
