package oop1.ex;

public class Account {
    int balance; // 잔액

    void deposit(int amount) {
        balance += amount; // 입금 시 잔액 증가
    }

    void withdraw(int amount) {
        if (balance >= amount){
            balance -= amount; // 출금 시 잔액 감소
        } else  {
            System.out.println("잔액 부족");
        }
    }
}
