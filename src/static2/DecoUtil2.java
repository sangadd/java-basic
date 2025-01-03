package static2;

public class DecoUtil2 {

    /*
    DecoUtil1 과 달리 DecoUtil2는 메서드 앞에 static 붙이기
    -> 이렇게 하면 정적 메서드를 만들 수 있다
    그리고 이 정적 메서드는 정적 변수처럼 인스턴스 생성 없이 클래스 명을 통해 바로 호출 가능
    */
    public static String deco(String str){
        return  "*" + str + "*";
    }
    // static이 붙으면 클래스 소속이라고 생각하자
}
