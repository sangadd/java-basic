package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        // 근데 이 코드 단점은 1000이 뭘 뜻하는지 모르니까 상수 만든걸 사용하자 (일관되게 관리 가능)
        System.out.println("프로그램 최대 참여자 수" + 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount){
        System.out.println("참여자 수" + currentUserCount);
        if (currentUserCount > 1000){
            System.out.println("대기자로 등록");
        } else {
            System.out.println("게임에 참여");
        }
    }
}
