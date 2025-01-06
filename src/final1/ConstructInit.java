package final1;

public class ConstructInit {
    final int value; // FinalFieldMain 클래스에서 인스턴스 생성할 때 값 할당했으니 값 더이상 수정 불가능

    // final을 필드에 사용할 경우 생성자를 만들어 한 번 초기화할 수 있음
    public ConstructInit(int value) {
        this.value = value;
    }
}
