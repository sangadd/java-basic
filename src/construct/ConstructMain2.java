package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct memberConstruct1 = new MemberConstruct("user1", 15, 90);

        // 생성자를 오버로딩 한 덕분에 성적 입력이 꼭 필요한 경우에는 grade가 있는 생성자를 호출하면 되고
        // 그렇지 않은 경우에는 grade가 없는 생성자를 호출하면 됨
        // grade가 없는 생성자를 호출하면 성적이 50점이 됨
        MemberConstruct memberConstruct2 = new MemberConstruct("user2", 16);

        MemberConstruct[] memberConstructs = {memberConstruct1, memberConstruct2};
        for (MemberConstruct memberConstruct : memberConstructs) {
            System.out.println("이름 : " + memberConstruct.name + "나이 : " + memberConstruct.age + "성적: " + memberConstruct.grade);
        }

    }
}