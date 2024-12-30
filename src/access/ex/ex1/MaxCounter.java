package access.ex.ex1;

public class MaxCounter {
    private int count = 0;
    private int max;
    public MaxCounter(int max){ // 이 클래스는 다른 패키지에서도 사용할 수 있어야 하니까 public로 해야함
        this.max = max;
    }

    public void increment(){
        // 검증 로직 -> 여기서 검증 못하면 return 으로 뺴버리기
        if (count >= max){
            System.out.println("최대값 초과 못함");
            return;
        }

        // 실행 로직
        count++;
    }
    public int getCount(){
        return count;
    }
}
