package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);

        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent)  {
        parent.prentMethod();

        // 파라미터 parent가 Child로부터 생성된 인스턴스면
        if (parent instanceof Child) { // 즉 오른쪽에 있는 타입이 왼쪽에 있는 인스턴스 타입에 들어갈 수 있는지 대입해보기
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent; // 다운캐스팅
            child.childMethod();
        }
    }
}
