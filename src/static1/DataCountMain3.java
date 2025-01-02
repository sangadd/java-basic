package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println(Data3.count); // 클래스에 직접 접근하는 것처럼 느껴짐 (.을 사용하니까)
        /*
        - static이 붙은 멤버 변수는 메서드 영역에서 관리함
            static이 붙은 멤버변수 count는 인스턴스 영역에 생성되지 않음 대신에 메서드 영역에서 이 변수를 관리함
        - Data3("A") 인스턴스를 생성하면 생성자가 호출된다
        - 생성자에는 count++ 코드가 있다 count는 static 이 붙은 정적 변수인데
        정적변수는 인스턴스 영역이 아니라 메서드 영역에서 관리한다 따라서 이 경우 메서드 영역에 있는 count 값이 하나 증가된다.
        */

        /*
        static이 붙은 정적 변수에 접근하려면 Data3.count와 같이 클래스명 + . + 변수명으로 접근하면 됨
        */

        /*
        메서드 영역에서 관리한다는 말이 뭔 말이냐
        공용으로 쓸거다

        즉 static 변수는 쉽게 얘기해서 클래스인 붕어빵 틀이 특별히 관리하는 변수이다
        붕어빵 틀은 1개이므로 클래스 변수도 하나만 존재함
        반면에 인스턴스인 붕어빵은 인스턴스의 수 만큼 변수가 존재한다.
        */

        Data3 data2 = new Data3("B");
        System.out.println(Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println(Data3.count);

        // 추가
        // 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); // 정적 변수인 경우 인스턴스를 통한 접근은 추천 X 왜냐하면 코드를 읽을 때 마치 인스턴스 변수에 접근하는 것처럼 오해 가능

        /*
        코딩할 때 만드는 입장과 가져다 쓰는 입장으로 나눠야 하는데
        제일 중요한건 가져다 쓰는 입장임
        */

        // 클래스를 통한 접근
        System.out.println(Data3.count); // 정적 변수는 클래스에서 공용으로 관리하기 때문에 클래스를 통해서 접근하는 것이 더 명확함
        // 따라서 정적 변수에 접근할 때는 클래스를 통해서 접근하자!!!!!!!!!

    }
}
