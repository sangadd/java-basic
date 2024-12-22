
package type.reference;

public class NullMain2 {
    public static void main(String[] args) {
       BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count); // 0
        System.out.println("bigData.data = " + bigData.data); // null 참조형은 초기값이 null로 들어가기떄문에 null

        System.out.println("bigData.data.value" + bigData.data.value); // NullPointerException

        // => 해결은 NullMain3에서 함
    }
}
