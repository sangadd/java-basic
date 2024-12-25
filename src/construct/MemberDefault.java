package construct;

public class MemberDefault {
    String name;

    MemberDefault(){
        // 생성자 필요
    }

    /*
     * 기본 생성자
     * 매개변수가 없는 생성자를 기본 생성자라고 함 ==> MemberConstruct(){ // 생성자 필요 }
     * 클래스에 생성자가 하나도 없으면 자바 컴파일러는 매개변수가 없고 작동하는 코드가 없는 기본 생성자를 자동으로 만들어줌
     * 생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다 !!!
     */

    /*
    기본 생성자를 왜 자동으로 만들어줄까?
    만약 자바에서 기본 생성자를 만들어주지 않는다면 생성자 기능이 필요하지 않은 경우에도 모든 클래스에 개발자가 직접 기본 생성자를 정의해야함
    생성자 기능을 사용하지 않는 경우도 많기 떄문에 이런 편의 기능 제공
    */

    // 정리
    // 생성자는 반드시 호출되어야 한다
    // 생성자가 없으면 기본 생성자가 제공됨
    // 생성자가 하나라도 있으면 기본 생성자가 제공되지 않음 이 경우 개발자가 직접 생성자를 호출해야함
}
