package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student(); // 객체 생성
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름 : " + students[0].name + "나이 : " + students[0].age + "성적: " + students[0].grade);
        System.out.println("이름 : " + students[1].name + "나이 : " + students[1].age + "성적: " + students[1].grade);

        /*
        * Student[] students = new Student[2];
        * 이 코드는 Student 변수를 개 보관할 수 있는 사이즈 2의 배열을 만든다.
        * Student 타입의 변수는 Student 인스턴스의 참조값을 보관한다.
        * Student 배열의 각각의 항목도 Student 타입의 변수일 뿐이다. 따라서 Student 타입의 참조값을 보관함
        * 배열에는 아직 참조값을 대입하지 않았기 때문에 참조값이 없다는 의미로 null 값으로 초기화됨

        * 이제 배열에 객체를 보관해야함
        students[0] = student1;
        students[1] = student2;
        *
        // 중요!!!!! 자바에서 대입은 항상 변수에 들어있는 값을 복사한다.
        students[0] = x001;
        students[1] = x002;
        * student1 과 student2애는 참조값이 보관되어 있다.
        * 따라서 이 참조값이 배열에 저장된다 또는 student1과 student1에 보관된 참조값을 읽고 복사해서 배열에 대입한다고 표현한다.
        */
    }
}