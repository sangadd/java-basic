package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit memberInit1 = new MemberInit();
        initMember(memberInit1, "user1", 15, 90);

        MemberInit memberInit2 = new MemberInit();
        initMember(memberInit2, "user2", 16, 80);

        MemberInit[] members = {memberInit1, memberInit2};

        for (int i = 0; i < members.length; i++) {
            MemberInit memberInit = members[i];
            System.out.println("이름: " + memberInit.name + "나이: " + memberInit.age + "성적: " + memberInit.grade);
        }
    }

    static void initMember(MemberInit memberInit, String name, int age, int grade) {
        memberInit.name = name;
        memberInit.age = age;
        memberInit.grade = grade;
    }

    /*
    initMember 메서드를 사용해서 반복을 제거했다 근데 이 메서드는 대부분 Member 객체의 멤버 변수를 사용함
    이제 객체 지향에 대해서 배웠기 떄문에 속성과 기능을 한 곳에 두는 것이 더 나은 방법임
    즉 MemberInit이 자기 자신의 데이터를 변경하는 기능(메서드)를 제공하는 것이 좋다 ==> MethodInitMain3 클래스에서 구현함
    */
}
