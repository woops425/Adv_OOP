package Hw1_1;

public class Main {
    public static void main(String[] args) {
        //***************************
// 파일명: Main.java
// 작성자: 202010629 박상우
// 작성일: 2025.09.24
// 내용: Resettable 인터페이스, Point, BankAccount 클래스 작동을 위한 Main 클래스
        //***************************
        System.out.println("과제코드 : hw1_1");
        System.out.println("202010629 박상우");

        // 객체 생성
        BankAccount account = new BankAccount(1000);

        // 500원 입금
        account.deposit(500);
        // 200원 출금
        account.withdraw(200);

        // 은행계좌 정보 알아내어 출력(잔액만 출력)
        System.out.println(account);

        // 은행계좌 리셋
        account.reset();

        // 은행계좌 정보 알아내어 출력(잔액만 출력)
        System.out.println(account);

        // 포인트 객체 생성
        Point point = new Point(1.5, 2.5);

        // (2.1, 2.1)만큼 포인트 이동
        point.move(2.1, 2.1);
        // (10.0, 10.0) 만큼 포인트 이동
        point.move(10.0, 10.0);

        // 포인트 정보 알아내어 출력(x,y) 좌표만 출력
        System.out.println(point);

        // 포인트 리셋
        point.reset();

        // 포인트 정보 알아내어 출력(x,y) 좌표만 출력
        System.out.println(point);
    }
}
