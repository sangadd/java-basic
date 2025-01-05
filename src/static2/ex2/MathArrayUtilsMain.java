package static2.ex2;

import static static2.ex2.MathArrayUtils.*;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
/*        System.out.println("sum= " + MathArrayUtils.sum(values));
        System.out.println("average= " + MathArrayUtils.average(values));
        System.out.println("min= " + MathArrayUtils.min(values));
        System.out.println("max= " + MathArrayUtils.max(values));*/

        // 위에 코드를 alt + enter를 통해 리팩토링함
        System.out.println("sum= " + sum(values));
        System.out.println("average= " + average(values));
        System.out.println("min= " + min(values));
        System.out.println("max= " + max(values));


    }
}
