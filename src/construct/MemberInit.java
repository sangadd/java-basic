package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        /*
        나의 멤버변수에 있는 값을 넣어주고 싶을 떄 이름이 똑같으니까 ==> initMember(String name, int age, int grade)
        this 붙이기 즉 자기자신의 인스턴스를 가리킴 ==> String name; int age; int grade;
        */
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    /* 여기서 색상으로 구분되었긴 했는데 만약 this가 없다고 치면 name = name; 이 코드가 되는데
    * 앞에 name은 멤버변수고 뒤에 name은 매개변수를 가리키기 때문에 이걸 구분하기 위해서 this를 붙임

    *
    * 멤버 변수와 메서드의 매개변수의 이름이 같으면 둘은 어떻게 구분 ?
    * 이 경우 멤버 변수보다 매개변수가 코드 블럭의 더 안쪽에 있기 떄문에 매개변수가 우선순위를 가짐 !!!
    * 따라서 initMember() 메서드 안에서 name이라고 적으면 매개변수에 접근하게 됨
    *
    * 그래서 멤버변수에 접근하려면 앞에 this. 이라고 해주면 됨 여기서 this는 인스턴스 자신의 참조값을 가리킴
    */

    /*
    this 생략이 가능함 (권장X)

    이 경우 변수를 찾을 때 가까운 지역변수(매개변수도 지역변수다)를 먼저 찾고 없으면 그 다음으로 멤버변수를 찾는다.
    멤버변수도 없으면 오류가 발생함
    예시로 필드 이름과 매개변수의 이름이 서로 다를떄 ! ==> MemberThis 클래스 확인
    */
}
