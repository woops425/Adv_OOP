package Hw5_1;

public class HD108ReceiptPrinter implements ReceiptPrinter {
    //***************************
// 파일명: HD108ReceiptPrinter.java
// 작성자: 202010629 박상우
// 작성일: 2025.10.01
// 내용: Real printer 클래스. ReceiptPrinter 인터페이스를 구현함
    //***************************
    @Override
    public void print(StringBuffer buf) {
        System.out.println("Real Print");
        System.out.println(buf);
    }
}
