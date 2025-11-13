package Hw10_1;
//***************************
// 파일명: ToppingDecorator.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.12
// 내용: AbstractPizza 추상 클래스를 상속받은 데코레이터 클래스. 디테일한 데코레이터 클래스들에게 상속해주기 위한 부모 클래스.
//***************************

public class ToppingDecorator extends AbstractPizza{
    protected AbstractPizza pizza;

    public ToppingDecorator(AbstractPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return pizza.getName();
    }

    @Override
    public int getSize() {
        return pizza.getSize();
    }

    @Override
    public int getPrice() {
        return pizza.getPrice();
    }
}
