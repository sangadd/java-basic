package static1;

public class Data1 {
    public String name;
    public int count;

    public Data1(String name) {
        this.name = name;
        count++;
    }

    // 생성된 객체의 수를 세어야 함
    // 따라서 객체가 생성될 떄마다 생성자를 통해 인스턴스의 멤버변수인 count 값을 증가시켜야한다
}
