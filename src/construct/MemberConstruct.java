package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    /*
        this()를 사용하기 전 코드
        MemberConstruct(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 50; // 새로 추가한 생성자는 grade를 받지 않는다 대신에 grade는 50점이 됨
    }
    */

    // this()를 사용한 코드
    /*
    아래 MemberConstruct(String name, int age, int grade) { 이 로직 실행됨
    즉 첫번쨰 생성자 내부에서 두번쨰 생성자를 호출함
    MemberConstruct(String name, int age) ->  MemberConstruct(String name, int age, int grade)

    this()라는 기능을 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있음
    참고로 this는 인스턴스 자신의 참조값을 가리킴 그래서 자신의 생성자를 호출한다고 생각하면 됨
     */
    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }

    // 이 부분이 생성자
    // 생성자의 이름은 클래스 이름과 같아야 함 따라서 첫 글자도 대문자로 시작
    // 생성자는 반환 타입이 없음 비워두어야 함
    // 나머지는 메서드와 같음
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + "age = " + age + "grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    /*
    * 근데 코드에서 중복되는 부분이 존재함
    this.name = name;
    this.age = age;
    *
    * 그래서 this()를 사용하지 않은 코드에서 사용한 코드를 확인해보기
    *
    * this() 규칙
    * 생성자 코드의 첫 줄에만 작성가능
    */
}
