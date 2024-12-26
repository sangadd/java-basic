package pack;
import pack.a.*; // 특정 패키지에 포함된 모든 클래스를 포함해서 사용하고 싶으면 *(뼐) 사용
public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // import 사용으로 패키지명 생략 가능
        User2 user2 = new User2();
    }
}
