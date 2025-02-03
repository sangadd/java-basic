package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);

        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent)  {
        parent.prentMethod();

        // Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) { // 자바 16부터는 instanceof를 사용하면서 동시에 변수를 선언할 수 있다
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
