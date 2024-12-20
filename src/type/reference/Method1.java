package type.reference;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student(); // x001
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student(); // x002
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    /* 참조형은 메서드를 호출할 때 참조값을 전달한다. 따라서 메서드 내부에서 전달된 참조값을 통해 객체의 값을 변경하거나 값을 읽어서 사용 가능 */

    // 이 메서드는 전달한 학생 객체의 필드에 값을 설정함
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    /*
    그럼 Student student 이건 x001 참조값이 들어가고
            x001.name = "학생1";
            x001.age = 15;
            x001.grade = 90; 이렇게 전달하는 것임 학생2 로직도 똑같음

     그럼 왜 이 메서드를 생성했냐
     student1이 참조하는 Student 인스턴스에 값을 편리하게 할당하고 싶어서 이 메서드를 만들었다.

     이 메서드를 호출하면서 student1을 전달 -> 그러면 student1의 참조값이 매개변수 student에 전달됨
     이 참조값을 통해 initStudent() 메서드 안에서 student1이 참조하는 것과 동일한 x001 Student 인스턴스에 접근하고 값을 변경할 수 있다.
    */


    // 이 메서드는 전달한 학생 객체의 필드 값을 읽어서 출력함
    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
