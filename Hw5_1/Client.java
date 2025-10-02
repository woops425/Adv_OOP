package Hw5_1;

public class Client {
    public static void main(String[] args) {
        //***************************
// 파일명: Client.java
// 작성자: 202010629 박상우
// 작성일: 2025.10.01
// 내용: setter를 활용하여 Fake printer와 Real printer 설정을 하는 전략을 적용한 main 클래스
        //***************************

        System.out.println("hw5_1 : 202010629 박상우");
        System.out.println();

        Item item1 = new Item("Shampoo", 3000);
        Item item2 = new Item("Cookie", 1000);

        // Fake printer를 사용하는 경우
        Sale sale1 = new Sale();
        sale1.setReceiptPrinter(new FakePrinter());
        sale1.add(item1);
        sale1.add(item2);
        sale1.printReceipt();

        // Real printer를 사용하는 경우
        Sale sale2 = new Sale();
        sale2.setReceiptPrinter(new HD108ReceiptPrinter());
        sale2.add(item1);
        sale2.add(item2);
        sale2.printReceipt();
    }
}
