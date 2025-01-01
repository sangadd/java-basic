package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
     Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println(counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println(counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println(counter.count);
    }

    /*
    Counter 인스턴스를 공용으로 사용한 덕분에 객체를 생성할 떄마다 값을 정확하게 증가시킬 수 있었다

    근데 여기서 불편한 점들이 있음
    Data2 클래스와 관련된 일인데 Counter라는 별도의 클래스를 추가로 사용해야하고
    생성자의 매개변수도 추가되고 생성자가 복잡해지고
    생성자를 호출하는 부분도 복잡해진다.
    */
}
