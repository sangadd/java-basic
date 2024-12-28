package access.a;

public class AccessData {
    /*
    접근 제어자 종류
    1. private : 모든 외부 호출을 막음
    2. default(package-private) : 같은 패키지 안에서 호출은 허용함 , 아무것도 안적은게 default 이다. ex) int volume;
    3. protected : 같은 패키지 안에서 호출은 허용함 , 패키지가 달라도 상속 관계의 호출은 허용함
    4. public : 모든 외부 호출을 허용함

    순서대로 private 이 가장 많이 차단하고 public 이 가장 많이 허용한다.

    package-private
    접근 제어자를 명시하지 않으면 같은 패키지 안에서 호출을 허용하는 default 접근 제어자가 적용된다.
    default 라는 용어는 해당 접근 제어자가 기본값으로 사용되기 때문에 붙여진 이름이지만 실제로는 package-private 이 더 확실한 표현이다.
    왜냐하면 해당 접근 제어자를 사용하는 멤버 변수는 동일한 패키지 내의 다른 클래스에서만 접근이 가능하기 떄문이다.
    참고로 두 용어를 함께 사용함

    접근 제어자 사용 위치는 필드와 메서드, 생성자에 사용됨
    추가로 클래스 레벨에도 일부 접근 제어자를 사용할 수 있다 (뒤에서 설명해주심)
     - public class Speaker {   // 이 부분을 클래스 레벨이라고 함

     접근 제어자의 핵심은 속성과 기능을 외부로부터 숨기는 것이다.
     - private 은 나의 클래스 안에서 속성과 기능을 숨길 때 사용, 외부 클래스에서 해당 기능을 호출할 수 없다.
     - default 는 나의 패키지 안에서 속성과 기능을 숨길 때 사용, 외부 패키지에서 해당 기능을 호출할 수 없다.
     - protected 는 상속 관계로 속성과 기능을 숨길 때 사용, 상속 관계가 아닌 곳에서 해당 기능을 호출할 수 없다.
     - public 은 기능을 숨기지 않고 어디서든 호출할 수 있게 공개한다.
     */

    public int publicField;
    int defaultField;
    private int privateField;

    public void  publicMethod(){
        System.out.println("publicField 호출" + publicField);
    }

    void defaultMethod(){
        System.out.println("defaultField 호출" + defaultField);
    }

    private void privateMethod(){
        System.out.println("privateField 호출" + privateField);
    }

    public void innerAccess(){ // 자기 자신에게 접근하는 것이니까 private을 포함한 모든 곳에 접근 가능
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
