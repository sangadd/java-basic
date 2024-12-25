package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    MemberConstruct(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 50; // 새로 추가한 생성자는 grade를 받지 않는다 대신에 grade는 50점이 됨
    }

    // 이 부분이 생성자
    // 생성자의 이름은 클래스 이름과 같아야 함 따라서 첫 글자도 대문자로 시작
    // 생성자는 반환 타입이 없음 비워두어야 함
    // 나머지는 메서드와 같음
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name = " + name + "age = " + age + "grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
