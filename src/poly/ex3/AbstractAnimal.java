package poly.ex3;

// AbstractAnimal은 abstract 가 붙은 추상 클래스이다. 이 클래스는 직접 인스턴스 생성 불가능
public abstract class AbstractAnimal {
    // 이 메서드는 자식이 오버라이딩 해야 하는 목적으로 생성했고
    public abstract void sound();

    // 이 메서드는 자식이 기능을 상속받아서 사용하는 목적으로 생성했다. / 자식 클래스가 오버라디이 하지 않아도 됨
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
