package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId" , "kim");
        member.print();
        member.changeData("myId2", "seo"); // 여기서 왜 id 값이 변경안되냐면 final로 선언했자나 (즉 값을 변경하기 싫으니까 final을 쓴거)
        member.print();
    }
}
