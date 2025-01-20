package extends1.super2;

public class ClassB extends ClassA{
    // ClassB는 ClassA를 상속 받았다. 상속 받으면 생성자의 첫 줄에 super()를 사용해서 부모 클래스의 생성자를 호출해야한다!!!!

    public ClassB(int a){
        super(); // 이거 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a);
    }

//    public ClassB(int a){
//        this(a, 0); // (2) this는 내 생성자 로직을 내가 호출하는거니까 여기가 아닌 아래 생성자 호출되는것임 (즉 내 생성자말고 다른 생성자 호출해줘)
//        System.out.println("ClassB 생성자 a = " + a);
//    }

    public ClassB (int a, int b){ // (3) 여기 생성자 호출이 되고 무조건 한 번은 super();를 호출해야함
        super(); // 이거 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a + "b = " + b);
    }

    // 위에 생성자를 정의해줬으므로 자바에서 기본 생성자인
    // public ClassB(){} 를 자동으로 생성안해줌
}
