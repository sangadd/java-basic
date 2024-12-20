package type.reference;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);
        // 변수 student1,2를 통해 Student 인스턴스를 사용 가능, Student는 반환 타입


        printStudent(student1);
        printStudent(student2);
    }

    /*
    Student student1 = new Student();
    initStudent(student1, "학생1", 15, 90); 이거 선언과 동시에 초기화하고 싶음 그래서 아래 코드를 구현함

    즉 createStudent() 메서드를 만들고 객체를 생성하는 부분도 이 메서드안에 함께 포함했다.
    이제 이 메서드 하나로 객체의 생성과 초기값설정을 모두 처리한다.

    그런데 메서드 안에서 객체를 생성했기 떄문에 만들어진 객체를 메서드 밖에서 사용할 수 있게 돌려주어야한다
    그래야 메서드 밖에서 이 객체를 사용할 수 있다.
    메서드 호출 결과를 반환(return) 을 할 수 있다. 메서드의 반환 기능을 사용해 만들어진 객체의 참조값을 메서드 밖으로 반환하면 됨
    */

    static Student createStudent(String name, int age, int grade){
        Student student= new Student(); // x001
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; // x001
    }

    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
