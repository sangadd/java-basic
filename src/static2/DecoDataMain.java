package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출");
        DecoData data2 = new DecoData(); // 인스턴스는 다시 생성되니까 1 이고
        data2.instanceCall(); // static은 이어서 호출하니까 ++ 하니까 3이 됨

        DecoData.staticCall(data1);
    }
}
