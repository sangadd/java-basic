package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        // 위 코드가 즉 아래 코드와 동일함
//        final Data data; // 참조형
//        data = new Data();  // 이미 참조값 들어감
//        data = new Data(); // 두 번은 불가능

        /*
        <<<<참조 대상의 값은 변경 가능>>>>
        즉 참조형 변수 data에 final이 붙었다. 이 경우 참조형 변수에 들어있는 참조값을 다른 값으로 변경하지 못한다.
        쉽게 이야기해서 이제 다른 객체를 참조할 수 XXX

        근데 참조형 변수에 들어있는 참조값만 변경하지 못하고 이 변수 이외에 다른 곳에 영향을 주는 것이 아니기 때문에 Data.value는 final이 아니다.
        따라서 data.value는 값 변경 가능!

        => (헷갈리지 않기) 참조형 변수에 final이 붙으면 참조 대상 자체를 다른 대상으로 변경 못하는 것이지, 참조하는 대상의 값은 변경 가능
        */

        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

    }
}
