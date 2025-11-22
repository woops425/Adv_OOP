package Hw10_1;

//***************************
// 파일명: PepperoniToppingDecorator.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.12
// 내용: ToppingDecorator 클래스를 상속받은 페퍼로니 토핑 클래스. 데코레이터 기능을 상세하게 구현하기 위한 클래스이다.
//***************************


public class PepperoniToppingDecorator extends ToppingDecorator {
    public PepperoniToppingDecorator(AbstractPizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return "페퍼로니 " + pizza.getName();
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + ToppingsPrice.PEPPERONI;
    }
}
