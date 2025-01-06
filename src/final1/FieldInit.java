package final1;

public class FieldInit {
    static final int CONST_VALUE = 10;
    // static final이 붙으면 자바 관례에 따라 변수명은 대문자로 작성해야함
    final int value = 10;

    // 이미 값을 할당해줬으니 생성자에서도 못바꿈

//    public FieldInit(int value) {
//        this.value = value;
//    }
}
