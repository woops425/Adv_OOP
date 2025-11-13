package Hw10_1;

//***************************
// 파일명: Pizza.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.12
// 내용: 기본 피자 클래스. AbstractPizza 클래스를 상속받음
//***************************
class Pizza extends AbstractPizza{
    
    public Pizza(int size) {
        this.size = size;
        name = "피자";
        price = 20000;
    }
    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
