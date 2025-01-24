package poly.basic;

// upcasting vs downcasting
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();

        // 부모는 자식을 담을 수 있다.
        Parent parent1 = (Parent) child; // 업캐스팅은 생략 가능, 생략 권장

        Parent parent2 = child; // 업캐스팅 생략

        parent1.prentMethod();
        parent2.prentMethod();

        /*
        * 업캐스팅은 생략할 수 있다.
        * 다운캐스팅은 생략할 수 없다.
        * 참고로 업캐스팅은 매우 자주 사용하기 때문에 생략을 권장한다.
        * 자바에서 부모는 자식을 담을 수 있다. 하지만 그 반대는 안된다. (꼭 필요하다면 다운캐스팅을 해야 한다.)
        *
        * 그럼 왜 업캐스팅은 생략해도 되고 다운캐스팅은 왜 개발자가 직접 명시적으로 캐스팅을 해야할까?
        */
    }
}
