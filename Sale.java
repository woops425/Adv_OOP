package Hw5_1;

import java.util.ArrayList;
import java.util.Iterator;


public class Sale {
    //***************************
// 파일명: Sale.java
// 작성자: 202010629 박상우
// 작성일: 2025.10.01
// 내용: Sale 클래스. setter를 활용하는 방식으로 수정함
    //***************************
    private ArrayList<Item> items = new ArrayList<Item>();

    private ReceiptPrinter printer;

    public Sale () {
    }

    public void setReceiptPrinter(ReceiptPrinter printer) {
        this.printer = printer;
    }

    public void printReceipt() {
        Iterator<Item> itr = items.it