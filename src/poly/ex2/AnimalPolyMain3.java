package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
//        Animal dog = new Dog();
//        Animal cat = new Cat();
//        Animal caw = new Caw();
//
//        // 배열은 같은 타입의 데이터를 나열할 수 있따.
//        // Dog, Cat, Caw는 모두 Animal의 자식이므로 Animal 타입이다.
//        Animal[] animalArr = {dog, cat, caw};

        // 여기서 ctrl + alt + n 을 하면 변수 선언 된 것을 제거하고 합침 그럼 아래 처럼 됨
        
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Pig()};

        // 변하지 않는 부분
//        for (Animal animal : animalArr) {
//            System.out.println("동물 소리 테스트 시작");
//            animal.sound();
//            System.out.println("동물 소리 테스트 종료");
//        }
        
        // 코드에서 메서드를 생성하고 싶을 떄 ctrl + alt + m 단축키 사용 -> 위에 코드가 아래로 변경됨

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    // 변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    /*
    * 여기서 새로운 동물이 추가되었을 떄 코드가 변하는 부분과 변하지 않는 부분이 있다,.
    * main()은 코드가 변하는 부분이다.
    * 새로운 동물을 생성하고 필요한 메서드를 호출한다.
    * soundAnimal()는 코드가 변하지 ㅇ않는 부분이다
    */

    // 새로운 기능이 추가되었을 떄 변하는 부분을 최소화하는 것이 잘 작성된 코드다 !!!
    // 이렇게 하기 위해서는 코드에서 변하는 부분과 변하지 않는 부분을 명확하기 구분하는 것이 좋다

    /*
    * 지금까지 설명한 코드에는 사실 2가지 문제가 있다 ㅠㅠ
    1. Animal 클래스를 생성할 수 있는 문제
    2. Animal 클래스를 상속 받는 곳에서 sound() 메서드 오버라이딩을 하지 않을 가능성

    1. Animal 클래스를 생성할 수 있는 문제
    * Animal 클래스는 동물이라는 클래스이다. 이 클래스를 다음과 같이 직접 생성해서 사용할 일이 있을까 ?
    * Animal animal = new Animal();
    * 개, 고양이, 소가 실제 존재하는 것은 당연하지만 동물이라는 추상적인 개념이 실제로 존재하는 것은 이상하다.
    * 사실 이 클래스는 다형성을 위해서 필요한 것이지 직접 인스턴스를 생성해서 사용할 일은 없다.
    * 하지만 Animal도 클래스이기 떄문에 인스턴스를 생성하고 사용하는데 아무런 제약이 없다.
    * 누군가 실수로 new Animal()을 사용해서 Animal의 인스턴스를 생성할 수 있다는 것이다.
    * 이렇게 생성된 인스턴스는 작동은 하지만 제대로된 기능을 수행하지는 않는다
    *
    2. Animal 클래스를 상속 받는 곳에서 sound() 메서드 오버라이딩을 하지 않을 가능성
    *  예를 들어서 Animal을 상속 받는 Pig 클래스를 만든다고 가정하자
    * 우리가 기대하는 것은 Pig 클래스가 sound() 메서드를 오버라이딩해서 꿀꿀이라는 소리가 나도록 하는 것이다
    * 근데 개발자가 실수로 sound() 메서드를 오버라이딩 하는 것을 빠트릴 수 있다.
    * 이렇게 되면 부모의 기능을 상속받는다. public class Pig extends Animal{}
    * 따라서 코드상 아무런 문제가 발생하지 않는다.
    * 물론 프로그램을 실행하면 기대와  다르게 꿀꿀이 아니라 부모 클래스에 있는 Animal.sound()가 호출될 것이다.
    */
}
