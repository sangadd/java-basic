package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit memberInit1 = new MemberInit();
        memberInit1.name = "user1";
        memberInit1.age = 15;
        memberInit1.grade = 90;

        MemberInit memberInit2 = new MemberInit();

        memberInit2.name = "user2";
        memberInit2.age = 16;
        memberInit2.grade = 80;

        MemberInit[] members = {memberInit1, memberInit2};

        for (int i = 0; i < members.length; i++) {
            MemberInit memberInit = members[i];
            System.out.println("이름: " + memberInit.name + "나이: " + memberInit.age + "성적: " + memberInit.grade);
        }
/*        for (MemberInit memberInit : members) {
            System.out.println("이름: " + memberInit.name + "나이: " + memberInit.age + "성적: " + memberInit.grade);
        }*/

        /* 회원 객체를 생성하고 나면 각 변수에 초기값을 설정해줘야함
        * 근데 초기값을 설정하는 부분이 반복되기 때문에 반복을 제거해야함 ==> MethodInitMain2 클래스에서 작성*/
    }
}
