package construct;

public class MemberThis {
    String nameField;

    void  initMember(String nameParameter) {
        nameField = nameParameter;
    }
    // nameField 와 매개변수 nameParameter 가 이름이 다르기 때문에 this 생략 가넝
}
