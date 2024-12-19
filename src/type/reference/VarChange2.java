package type.reference;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값 = " + dataA); // type.reference.Data@2f4d3709
        System.out.println("dataB 참조값 = " + dataB); // type.reference.Data@2f4d3709
        System.out.println("dataA.value = " + dataA.value); // 10
        System.out.println("dataB.value = " + dataB.value); // 10
        // 변수 dataA에 들어있는 참조값을 복사해서 변수 dataB에 대입한다. 참고로 변수 dataA가 가르키는 인스턴스를 복사한느 것이 아니고
        // 변수에 들어있는 참조값만 복사해서 전달함

        dataA.value = 20;
        System.out.println("dataA.value = " + dataA.value); // 20
        System.out.println("dataB.value = " + dataB.value); // 20 둘 다 같은 인스턴스를 가리킴

        dataA.value = 30;
        System.out.println("dataA.value = " + dataA.value); // 30
        System.out.println("dataB.value = " + dataB.value); // 30 둘 다 같은 인스턴스를 가리킴

        // 여기서 중요한 핵심은
        // Data dataB = dataA라고 했을 때 변수에 들어있는 값을 복사해서 사용한다는 점임
        // 그런데 그 값이 참조값이다. 따라서 dataA와 dataB는 같은 참조값을 가지게 되고 두 변수는 같은 객체 인스턴스를 참조하게 된다!!
    }
}
