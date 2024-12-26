package pack.b;

public class User {
    public User(){ // 다른 패키지에서 이 클래스의 생성자를 호출하려면 pubilc 사용
        System.out.println("패키지 생성");
    }
}
