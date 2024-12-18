package class1;

public class ClassStart6 {
    public static void main(String[] args) {
        Student student1 = new Student(); // 객체 생성
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

/*      Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        이 코드를 아래로 변경 가능 */

        // Student[] students = new Student[] {student1, student2};
        // 이 코드를 아래로 또 변경 가능 (이걸 배열 선언 최적화라고 부름)

        Student[] students = {student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이 : " + students[i].age + " 성적: " + students[i].grade);
        }

        // for문 최적화
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름: " + s.name + " 나이: " + s.age + "성적: " + s.grade);
        }

        // 향상된 for문 사용
        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + "성적: " + s.grade);
        } // 단축키 iter
    }
}