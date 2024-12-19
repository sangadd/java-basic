package type;

public class Type2 {
    public static void main(String[] args) {
        /*
        * <<<대원칙>>>
        자바는 항상 변수의 값을 복사해서 대입한다.
        *
        * 기본형, 참조형 모두 항상 변수에 있는 값을 복사해서 대입한다. 기본형이면 변수에 들어있는 실제 사용하는 값을 복사해서 대입하고
        * 참조형이면 변수에 들어있는 참조값을 복사해서 대입한다.
        *
        * <기본형 대입>
        int a = 10;
        int b = a;
        *
        * <참조형 대입>
        Student s1 = new Student();
        Student s2 = s1;
        *
        * 기본형은 변수에 값을 대입하더라도 실제 사용하는 값이 변수에 바로 들어있기 때문에 해당 값만 복사해서 대입한다고 생각하면 쉽게 이해!
        * 근데 참조형의 경우 실제 사용하는 객체가 아니라 객체의 위치를 가르키는 참조값만 복사된다
        * 쉽게 말해서 실제 건물이 복사 되는것이 아니라 건물의 위치인 주소만 복사되는 것임 따라서 같은 건물을 찾아갈 수 있는 방법이 하나 늘어날 뿐임 */


    }
}