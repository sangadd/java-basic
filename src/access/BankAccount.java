package access;

public class BankAccount {
    private int balance;

    // 단축키 (Alt + Insert)
    public BankAccount() {
        balance = 0;
    }

    // public 메서드 : deposit
    // 입금
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다");
        }
    }

    // public 메서드 : withdraw
    // 출금
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다");
        }
    }


    public int getBalance() {
        return balance;
    }

    // 입력 금액을 검증하는 기능은 내부에서만 필요한 기능이라 private 사용
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }

    /*
    만약에 isAmountValid() 를 외부에 노출하면 어떻게 될까?
    BankAccount를 사용하는 개발자 입장에서는 사용할 수 있는 메서드가 하나 더 늘었다.
    그럼 아마도 입금과 출금 전에 본인이 먼저 isAmountValid() 메서드를 사용해서 검증을 해야하나? 라는 의문을 가질 것임

    그리고 balance 필드를 외부에 노출하게 되면 잔고를 무한정 늘리고 출금하는 심각한 문제 발생

    그래서 접근 제어자와 캡슐화를 통해 데이터를 안전하게 보호하고 BankAccount를 사용하는 개발자 입장에서 해당 기능을 사용하는 복잡도도 낮출 수 있다.
    */
}
