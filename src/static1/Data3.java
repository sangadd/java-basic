package static1;

public class Data3 {
    public String name;
    public static int count; // 멤버변수에 static을 붙이게 되면 static 변수, 정적 변수 또는 클래스 변수라 한다.
    // 객체가 생성되면 생성자에서 정적변수 count의 값을 하나 증가시킨다.

    public Data3(String name) {
        this.name = name;
        count++; // 이거 Data3.count++ 와 같음 왜 생략했냐면 해당 본인 클래스안에서 선언한거니까
    }
}
