package Hw5_1;

public class Item {
    //***************************
// 파일명: Item.java
// 작성자: 202010629 박상우
// 작성일: 2025.10.01
// 내용: Item 클래스는 이전과 변동 없음
    private String name;
    private int price;


    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
    }


    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
