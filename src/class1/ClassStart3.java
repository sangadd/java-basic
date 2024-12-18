package class1;

public class ClassStart3 {
    public static void main(String[] args) {
       Student student1; // 변수 선언
       student1 = new Student(); // 객체 생성

       student1.name = "학생1";
       student1.age = 15;
       student1.grade = 90;

       Student student2 = new Student();
       student2.name = "학생2";
       student2.age = 16;
       student2.grade = 80;

        System.out.println("이름 : " + student1.name + "나이 : " + student1.age + "성적: " + student1.grade);
        System.out.println("이름 : " + student2.name + "나이 : " + student2.age + "성적: " + student2.grade);

        /*
        * <클래스와 사용자 정의 타입>
        * 타입은 데이터의 종류나 형태를 나타낸다.
        * int라고 하면 정수 타입, String이라고 하면 문자 타입이다.
        * 학생이라는 타입을 만들면 되지 않을까????
        * 클래스를 사용하면 int, String과 같은 타입을 직접 만들 수 있다
        * 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하는데 이 설계도가 바로 클래스이다! (여기서는 Student.java)
        * 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다.
        * 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다.
        *
        * 중요한 용어
        * 클래스, 객체, 인스턴스 --> 이거 이해 무조건 해야됨 중요!
        *
        * 클래스는 설계도이고 이 설계도를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다.
        * 둘 다 같은 의미로 사용된다.
        * 여기서는 학생 클래스를 기반으로 학생1, 학생2 객체 또는 인스턴스를 만들었다.
        *
        * <코드 분석>
        * 1. 변수 선언
        *
        * 2. 객체 생성
        * student1 = new Student();
        * 객체를 사용하려면 먼저 설계도인 클래스를 기반으로 객체(인스턴스)를 생성해야 한다.
        * new Student() : new는 새로 생성한다는 뜻이다.
        * new Student()는 Student 클래스 정보를 기반으로 새로운 객체를 생성하라는 뜻이다.
        * 이렇게 하면 메모리에 실제 Student 객체(인스턴스)를 생성한다.
        * 객체를 생성할 때는 new 클래스명()을 사용하면 된다. 마지막에 ()도 추가해야함
        * Student 클래스는 String name, int age, int grade 라는 멤버 변수를 가지고 있는데 이 변수들을 사용하는데 필요한 메모리 공간도
        * 함께 확보한다.
        *
        * 3. 참조값 보관
        * student1 = x001; // Student 인스턴스 참조값 보관
        * 객체를 생성하고나면 자바는 메모리 어딘가에 있는 이 객체에 접근할 수 있는 참조값(주소)(x001)을 반환한다.
        *   (여기서 x001 이라고 표현한 것이 참조값이다. 실제로 x001처럼 표현되는 것은 아니고 이해를 돕기 위한 예시임)
        * new 키워드를 통해 객체가 생성되고나면 참조값을 반환한다.
        * 앞서 선언된 변수인 Student student1에 생성된 객체의 참조값(x001)을 보관한다.
        * new Student() 이게 x001 로 바뀐다는 말
        *
        * Student student1변수는 이제 메모리에 존재하는 실제 Student 객체(인스턴스)의 참조값을 가지고 있다.
        *  student1 변수는 방금 만든 객체에 접근할 수 있는 참조값을 가지고 있다.
        * 따라서 이 변수를 통해서 객체를 접근(참조)할 수 있다.
        * 즉 student1 변수를 통해 메모리에 있는 실제 객체를 접근하고 사용 가능
        *
        * <<< 그럼 왜 참조값을 변수에 보관해야 하는 이유 >>>
        객체를 생성하는 new Student() 코드 자체에는 아무런 이름이 없다.
        * 이 코드는 단순히 Student 클래스를 기반으로 메모리에 실제 객체를 만드는 것이다.
        * 따라서 생성한 객체에 접근할 수 있는 방법이 필요한데! 이런 이유로 객체를 생성할 때 반환되는 참조값을 어딘가에 보관해두어야 함
        * 그래서 Student student1 변수에 참조값(x001)을 저장해두었으므로 저장한 참조값(x001)을 통해 실제 메모리에 존재하는 객체에 접근할 수 있다는 것
        *
        * 지금까지 설명한 내용을 코드로 풀어보기
        Student student1 = new Student(); // 1. Student 객체 생성
        Student student1 = x001; // 2. new Student() 의 결과로 x001 참조값 반환
        student1 = x001;  // 3. 최종 결과
        */

    }
}