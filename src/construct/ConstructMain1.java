package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // 처음에 MemberConstruct memberConstruct1 = new MemberConstruct(); 이 코드에서
        // ctrl + p 를 하면 어떤 파라미터를 넣어야하는지 알려줌
        MemberConstruct memberConstruct1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct memberConstruct2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] memberConstructs = {memberConstruct1, memberConstruct2};
        for (MemberConstruct memberConstruct : memberConstructs) {
            System.out.println("이름 : " + memberConstruct.name + "나이 : " + memberConstruct.age + "성적: " + memberConstruct.grade);
        }

        /*
        생성자 호출
        생성자는 인스턴스를 생성하고 나서 즉시 호출됨
        생성자를 호출하는 방법은 다음 코드와 같이 new 명령어 다음에 생성자 이름과 매개변수에 맞추어 인수를 전달하면 됨
        new 생성자이름(생성자에 맞는 인수 목록)
        new 클래스이름(생성자에 맞는 인수 목록)
        참고로 생성자 이름이 클래스이름이기 떄문에 둘 다 맞는 표현임

        new MemberConstruct("user1", 15, 90);
        이 코드는 인스턴스를 생성하고 즉시 해당 생성자를 호출함 여기서 Member 인스턴스를 생성하고
        바로 new MemberConstruct(String name, int age, int grade); 생성자를 호출함

        참고로
        new 키워드를 사용해서 객체를 생성할 때 마지막에 괄호를 포함해야하는 이유는 바로 생성자 때문임
        객체를 생성하면서 동시에 생성자를 호출한다는 의미를 포함함
        */

        /*
        제약 - 생성자 호출 필수
        생성자의 진짜 장점은 객체를 생성할 때 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출하기

        생성자를 사용하면 필수값 입력을 보장할 수 있다
        */
    }
}