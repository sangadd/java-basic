package poly.ex5;

public class Bird extends AbstractAnimal implements Fly{

    // Bird 는 AbstractAnimal 클래스를 상속하고 Fly 인터페이스를 구현한다.
    // extends와 implements가 함께 나올 경우에는 implements는 다중 구현이 가능하기 떄문에 extends가 먼저 나와야 한다.
    
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
