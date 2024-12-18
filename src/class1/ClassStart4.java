package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student2;
        student2 = new Student();

        student2.name = "학생1";
        student2.age = 15;
        student2.grade = 90;

        System.out.println("이름 : " + student2.name + "나이 : " + student2.age + "성적: " + student2.grade);

        /*
        student2.name = "학생1"; // 1. student1 객체의 name 멤버 변수에 값 대입
        x001.name = "학생1"; // 2. 변수에 있는 참조값을 통해 실제 객체에 접근 , 해당 객체의 name 멤버 변수에 값 대입
        */
    }
}