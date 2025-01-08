package final1;

public class Constant {
    /*
    상수(Constant)
    상수는 변하지 않고 항상 일정한 값을 갖는 수를 말한다.
    자바에서 보통 단 하나만 존재하는 변하지 않는 고정된 값을 상수라 한다.
    이러한 이유로 상수는 static final 키워드를 사용한다.
    */

    /*
    상수 특징
    1. static final 키워드 사용
    2. 대문자 사용, _(언더스코어)로 한다.(관례)
        일반적인 변수와 상수를 구분하기 위해
    3. 필드를 직접 접근해서 사용한다.
        상수는 기능이 아니라 고정된 값 자체를 사용하는 것이 목적이다.
        상수는 값을 변경할 수 없다. 따라서 필드에 직접 접근해도 데이터가 변하는 문자가 발생하지 X
    */

    //수학 상수
    public static final double PI = 3.14;
    //시간 상수
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;
    //애플리케이션 설정 상수
    public static final int MAX_USERS = 2000;
}
