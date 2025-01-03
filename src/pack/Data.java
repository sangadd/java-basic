package pack;

public class Data {
    public  Data(){
        System.out.println("패키지 생성");
    }

    /*
    패키지 규칙

    1. 패키지 이름과 위치는 폴더(디렉토리) 위치와 같아야 함 (필수)
    2. 패키지 이름은 모두 소문자를 사용한다. (관례)
    3. 패키지 이름의 앞 부분에는 일반적으로 회사의 도메인 이름을 거꾸로 사용함 (관례)
        이 부분은 필수 아님
        하지만 수 많은 외부 라이브러리와 함께 사용하면 같은 패키지에 같은 클래스 이름이 존재 가능
        이렇게 도메인 이름을 거꾸로 하면 이런 문제 방지함

        그리고 내가 오픈소스나 라이브러리를 만들어서 외부에 제공한다면 꼭 지키는 것이 좋다.

        내가 만든 애플리케이션을 다른 곳에 공유하지 않고 직접 배포한다면 보통 문제가 되지 않음
    */

    /*
    패키지와 계층 구조
    - a
        - b
        - c
    패키지는 이런 계층 구조를 이룸

    */
}
