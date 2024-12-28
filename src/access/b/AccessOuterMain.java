package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();
        // public 호출 가능
        accessData.publicField = 10;
        accessData.publicMethod();

        // default 호출 불가 (다른 패키지니깐)
//        accessData.defaultField = 20;
//        accessData.defaultMethod();

        // private 호출 불가
//        accessData.privateField = 3;
//        accessData.privateMethod();

        accessData.innerAccess();
        
        // 참고로 생성자도 접근 제어자 관점에서 메서드와 같다
    }
}

