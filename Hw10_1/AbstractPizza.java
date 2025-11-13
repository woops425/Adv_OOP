package Hw10_1;
//***************************
// 파일명: AbstractPizza.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.12
// 내용: Pizza와 ToppingDecorator 클래스가 공유하는 공통 추상 클래스.
//***************************
public abstract class AbstractPizza {
    protected String name = "피자";
    protected int size = 0;
    protected int price = 0;

    public abstract String getName();
    public abstract int getSize();
    public abstract int getPrice();
}
