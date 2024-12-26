package pack;


import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        Data data = new Data();
        User userA = new User();
        pack.b.User userB = new pack.b.User();

        // 같은 이름의 클래스가 존재하면 import 는 둘 중 하나만 선택 가능
        // 이떄 자주 사용하는 클래스를 import 하고 나머지는 패키지를 포함한 전체 경로 적기
    }
}
