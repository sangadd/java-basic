package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        // 추상 클래스는 인스턴스 생성 불가
        //    AbstractAnimal abstractAnimal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);

    }

    // 변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    // 변하지 않는 부분
    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }

    /*
    * 순수 추상 클래스
    * 모든 메서드가 추상 메서드인 순수 추상 클래스는 코드를 실행할 떄마다 바디 부분이 전혀 없다.
    *
    * public abstract class AbstractAnimal {
        public abstract void sound();
        public abstract void move();
        }
    *
    * 이러한 순수 추상 클래스는 실행 로직을 전혀 가지고 있지 않다.
    * 단지 다향성을 위한 부모 타입으로써 껍데기 역할만 제공할 뿐이다.
    *
    * 순수 추상 클래스는 다음과 같은 특징을 가진다.
    * 1. 인스턴스를 생성할 수 없다.
    * 2. 상속 시 자식은 모든 메서드를 오버라이딩해야 한다.
    * 3. 주로 다형성을 위해 사용된다.
    *
    * 상속하는 클래스는 모든 메서드를 구현해야 한다.
    * 상속시 자식은 모든 메서드를 오버라이팅 해야 한다라는 특징은 상속 받는 클래스 입장에서 보면 부모의 모든 메서드를 구현해야 한다
    * 이런 특징을 잘 생각해보면 순수 추상 클래스는 마치 어떤 규칙을 지켜서 구현해야 하는 것처럼 느껴진다.
    * AbstractAnimal의 경우 sound(), move() 라는 규격에 맞추어 구현을 해야 한다.
    *
    * 이것은 우리가 일반적으로 이야기하는 인터페이스와 같이 느껴진다.
    * 예를 들어서 USB 인터페이스를 생각해보자 USB 인터페이스는 분명한 규격이 있다.
    * 이 규격에 맞추어 제품을 개발해야 연결이 된다.
    * 순수 추상 클래스가 USB 인터페이스 규격이라고 한다면 USB 인터페이스에 맞추어 마우스, 키보드 같은 연결 장치들을 구현할 수 있다.
    *
    * 이런 순수 추상 클래스의 개념은 프로그래미이에서 매우 자주 사용됨
    * 자바는 순수 추상 클래스를 더 편리하게 사용할 수 있또록 인터페이스라는 개념을 제공한다.
    */
}
