package poly.ex2;
public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Animal dog = new Dog();  // 부모는 자식을 담을 수 있음
        // Dog dog = new Dog(); 이렇게 해도 됨
        Animal cat = new Cat();
        Animal caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    // 이 코드에서는 Animal animal 가 핵심임

    /*
    * 다형적 참조 덕분에 animal 변수는 자식인 Dog, Cat, Caw 의 인스턴스를 참조할 수 있다. (부모는 자식을 담을 수 있다)
    * 즉 animal은 이 3가지 중 어느 것으로 변신할 수 있다는 말
    *
    * 메서드 오버라이팅 덕분에 animal.sound(); 를 호출해도 Dog.sound(), Cat.sound(), Caw.sound() 와 같이 각 인스턴스의 메서드를 호출할 수 있다.
    * 만약 자바에서 메서드 오버라이딩이 없었다면 모두 Animal의 sound()가 호출되었을 것이다.
    *
    * 다형성 덕분에 이후에 새로운 동물을 추가해도 다음 코드를 그대로 재사용 할 수 있다!!!
    * 물론 다형성을 사용하기 위해 새로운 동물은 Animal을 상속 받아야 한다.
    *
    *   private static void soundAnimal(Animal animal){
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    *
    */

}
