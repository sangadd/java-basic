package type;

public class Variable {
    public static void main(String[] args) {
        /*
        변수의 종류
        멤버 변수(필드) : 클래스에 선언
        지역 변수 : 메서드에 선언, 매개변수도 지역 변수의 한 종류이다.

        public class Student {
            String name;
            int age;
            int grade;
        }
        // 이 3개는 다 멤버 변수

        public class ClassStart4 {
            public static void main(String[] args) {
                Student student1;
                student1 = new Student();
                Student student2 = new Student();

            }
        }
        // student1과 student2는 지역 변수

        public class MethodChange1 {
            public static void main(String[] args) {
                int a = 10;
                System.out.println("메서드 호출 전 a : " + a); // 10
                changePrimitive(a);
                System.out.println("메서드 호출 후 a : " + a); // 10
            }

            static void changePrimitive(int x) {
                x = 20;
            }
        }
        // a, x(매개변수)는 지역변수


        지역변수는 이름 그대로 특정 지역에서만 사용되는 변수라는 뜻이다.
        */

        /*
        <변수의 값 초기화>
            멤버 변수 : 자동 초기화
                인스턴스의 멤버 변수는 인스턴스를 생성할 때 자동으로 초기화된다.
                숫자(int) = 0, boolean = false, 참조형 = null(null 같은 참조할 대상이 없다는 뜻)
                개발자가 초기값을 직접 지정 가능
            지역 변수 : 수동 초기화
                지역 변수는 항상 직접 초기화해야한다.
        */
    }
}
