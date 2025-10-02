package Hw5_1;

public class FakePrinter implements ReceiptPrinter {
    //***************************
// 파일명: FakePrinter.java
// 작성자: 202010629 박상우
// 작성일: 2025.10.01
// 내용: ReceiptPrinter 인터페이스의 print() 메소드를 오버라이드 한 FakePrinter 클래스
    @Override
    public void print(StringBuffer buf) {
        System.out.println("Fake print");
        System.out.println(buf);
    }
}
