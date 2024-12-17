package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름 : " + student1Name + "나이 : " + student1Age + "성적: " + student1Grade);
        System.out.println("이름 : " + student2Name + "나이 : " + student2Age + "성적: " + student2Grade);

        // 이 코드의 문제점은 학생이 늘어날 때마다 변수를 추가로 선언해야해서 이 문제를 배열로 해결 가능
    }
}