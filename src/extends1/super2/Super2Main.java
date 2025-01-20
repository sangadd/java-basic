package extends1.super2;

public class Super2Main {
    public static void main(String[] args) {
        ClassC classC = new ClassC();

        // (1) 근데 생성자 첫줄에 this를 사용할 수 있는데 일단 이렇게 인스턴스 생성해주면
//        ClassB classB = new ClassB(100);
    }

    /*
    * 실행해보면
    ClassA 생성자
    ClassB 생성자 a = 10b = 20
    ClassC 생성자
    * 이렇게 출력됨
    * 실행되는 순서 잘 알기 super 가 있으면 그거 먼저 실행하니까 */

    /*
     * 즉 실행해보면 ClassA -> ClassB -> ClassC 순서로 실행됨
     * 생성자의 실행 순서가 결과적으로 최상위 부모부터 실행되어서 하나씩 아래로 내려오는 것이다.
     * 따라서 초기화되는 최상위 부모부터 이루어진다.
     * 왜냐하면 자식 생성자의 첫 줄에서 부모 생성자를 호출해야 하기 떄문
    */
}
