package poly.ex.sender;

public class SendMain {

    /*
    문제1: 다중 메시지 발송
    한번에 여러 곳에 메시지를 발송하는 프로그램을 개발하자.
    다음 코드를 참고해서 클래스를 완성하자

    * 부모의 인터페이스 생성하고
    * 구현들 만들고
    * 배열에 담고 for문 통해 출력
    */
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}
