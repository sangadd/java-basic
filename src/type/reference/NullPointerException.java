package type.reference;

public class NullPointerException {
    public static void main(String[] args) {
        /*
        택배를 보낼 때 주소지 없이 택배를 발송하면 어떤 문제가 발생할까?
        그리고 만약 참조값 없이 객체를 찾아가면 어떤 문제가 발생할까?

        NullPointerException은 이름 그대로 null을 가리키다(Pointer)인데
        이때 발생하는 예외(Exception)다.
        null은 없다는 뜻이므로 결국 주소가 없는 찾아갈 때 발생하는 예외이다.

        객체를 참조할 때 .을 사용한다. 이렇게 하면 참조값을 사용해서 해당 객체를 찾아갈 수 있다.
        그런데 참조값이 null이라면 값이 없다는 뜻이므로 찾아갈 수 있는 객체(인스턴스)가 없다.

        NullPointerException은 이처럼 null에 .을 찍었을 떄 발생한다.
        */

        Data data = null;
        data.value = 10; // NullPointerException 예외 발생 ---> 왜? .을 찍어서 주소를 찾아가는데 그럼 참조값을 알아야함 이떄 참조값이 null이기 떄문에 값을 할당할 수 없다.
        System.out.println(data.value);

        // 지금은 지역 변수기 떄문에 null 문제를 파악하는 것이 어렵지 않은데 멤버 변수가 null 일때는 주의가 필요함 (BigData.java과 NullMain2. java 확인)
    }
}
