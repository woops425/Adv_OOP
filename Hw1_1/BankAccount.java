package Hw1_1;

public class BankAccount implements Resettable {
    //***************************
// 파일명: BankAccount.java
// 작성자: 202010629 박상우
// 작성일: 2025.09.24
// 내용: Resettable 인터페이스를 구현하며, 잔액을 매개변수로 하여 초기화 하는 생성자 및
// 입출금 메소드 등을 수행하는 클래스
    //***************************

    private int balance; // 잔액
    private final int initialBalance; // 초기 잔액

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
        this.initialBalance = initialBalance;
    }

    // 입금
    // amount : 입금 금액
    public void deposit(int amount) {
        this.balance += amount;
        System.out.println(amount + "원 입금 완료");
    }

    // 출금
    // amount : 출금 금액
    public void withdraw(int amount) {
        this.balance -= amount;
        System.out.println(amount + "원 출금 완료");
    }

    @Override
    public void reset() {
        this.balance = this.initialBalance;
        System.out.println("은행 계좌 리셋");
    }

    public String toString() {
        return "잔액 : " + balance;
    }
}