package memory;

public class Data {
    private int value;

    public Data(int value) {
        this.value = value;
    }

    /*
    클래스 내부의 데이터(멤버 변수)를 외부로부터 보호하기 위해 멤버변수를 private로 선언함
    그럼 외부에서는 멤버변수를 직접 접근 못하고 대신 getter, setter 메서드를 통해 접근하거나 수정 가능

    getValue() 메서드를 통해서만 value 의 값을 읽을 수 있으므로 데이터를 보호하면서도 외부에서 안전하게 값을 가져오도록 허용함*/
    public int getValue() {
        return value;
    }
}
