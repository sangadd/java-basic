package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println(data1.count);

        Data1 data2 = new Data1("B");
        System.out.println(data2.count);

        Data1 data3 = new Data1("C");
        System.out.println(data3.count);
    }

    /*
    이 결과는 다 1임
    우리는 1, 2, 3으로 나오고 싶은데

    왜냐하면 객체를 생성할 때마다 Data1인스턴스는 새로 만들어진다.
    그리고 인스턴스에 포함된 count 변수도 새로 만들어지기 때문!!

    즉 인스턴스에 사용되는 멤버 변수 count 값은 인스턴스끼리 서로 공유 XXX
    따라서 원하는 답을 구할 수 없다
    이 문제를 해결하려면 변수를 서로 공유해야함
    */
}
