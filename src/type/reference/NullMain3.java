
package type.reference;

public class NullMain3 {
    public static void main(String[] args) {
       BigData bigData = new BigData();
       bigData.data = new Data(); // 참조값 넘겨줄 수 있도록 객체 생성

        System.out.println("bigData.count = " + bigData.count);// 0
        System.out.println("bigData.data = " + bigData.data); // x001 같은 참조값 결과로 나옴

        System.out.println("bigData.data.value" + bigData.data.value); // 0

        // => NullPointerException이 발생하면 null 값에 .을 찍었다고 생각하면 문제를 쉽게 해결 가능
    }
}
