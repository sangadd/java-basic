package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit memberInit1 = new MemberInit();
        memberInit1.initMember("user1", 15, 90);

        MemberInit memberInit2 = new MemberInit();
        memberInit2.initMember("user2", 16, 80);

        MemberInit[] members = {memberInit1, memberInit2};

        for (int i = 0; i < members.length; i++) {
            MemberInit memberInit = members[i];
            System.out.println("이름: " + memberInit.name + "나이: " + memberInit.age + "성적: " + memberInit.grade);
        }
    }

}
