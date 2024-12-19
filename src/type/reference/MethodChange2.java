package type.reference;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA.value = " + dataA.value); // 10
        changeReference(dataA);
        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value); // 20
    }

    static void changeReference(Data dataX) {
        dataX.value = 20;
    }

    /*
    위에 코드 분석
    1. Data 인스턴스 생성하고 참조값을 dataA 변수에 담고! 그 value에 숫자 10을 할당한다.
    Data dataA = new Data();
    dataA.value = 10;

    2. 메서드 호출
    메서드를 호출할 때(changeReference(dataA); 이 코드 말한거) 매개변수 dataX에 변수 dataA의 값을 전달한다.
    즉 int dataX = daqtaA
    자바에서 변수에 값을 대입하는 것은 항상 값을 복사해서 대입!!!!!!!!
    변수 dataA는 참조값 x001을 가지고 있으므로 참조값을 복사해서 전달했다.
    따라서 변수 dataA와 dataX 둘 다 같은 참조값인 x001을 가지게 됨
    이제 dataX를 통해서도 x001에 있는 Data 인스턴스에 접근 가능

    3. 메서드 안에서 값을 변경
    메서드 안에서 dataX.value = 20으로 새로운 값을 대입함
    참조값을 통해 x001 인스턴스에 접근하고 그 안에 있는 value의 값을 20으로 변경함
    dataA, dataX 모두 같은 x001 인스턴스를 참조하기 때문에 dataA.value, dataX.value 는 둘 다 20이라는 값을 가짐


    <진짜 중요한 기본형과 참조형의 메서드 호출>
    자바에서 메서드의 매개변수(파라미터)는 항상 값에 의해 전달됨 그러나 이 값이 실제 값이냐 참조(메모리 주소)값이냐에 따라 동작이 달라짐

    기본형 : 메서드로 기본형 데이터를 전달하면 해당 값이 복사되어 전달됨 이 경우 내부에서 파라미터의 값을 변경해도 호출자의 변수 값에는 영향이 없음

    참조형 : 메서드로 참조형 데이터를 전달하면 참조값이 복사되어 전달됨 이 경우 메서드 내부에서 파라미터로 전달된 객체의 멤버 변수를 변경하면
    호출자의 객체도 변경됨
    */
}