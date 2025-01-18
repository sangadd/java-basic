package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue = 1;
        protectedValue = 1; // 상속 관계 or 같은 패키지 -> 여기서는 상속 관계이므로 접근 가능
//        defaultValue = 1; // 다른 패키지 접근 불가, 컴파일 오류4
//        privateValue = 1; // 접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); // 상속 관계 or 같은 패키지
//        defaultMethod(); // 접근 불가, 컴파일 오류
//        privateMethod(); // 접근 불가, 컴파일 오류

        printParent();
    }
}
