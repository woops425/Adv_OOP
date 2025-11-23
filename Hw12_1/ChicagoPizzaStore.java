package Hw12_1;

public class ChicagoPizzaStore extends PizzaStore {
//***************************
// 파일명: ChicagoPizzaStore.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.23
// 내용: 기존에 존재했던 PizzaStore 클래스를 상속 받음. 객체를 생성하는 메소드인 createPizza() 메소드를
    // 오버라이딩 하여 서브클래스 중 하나인 해당 클래스에서 객체 생성을 담당.
//***************************

    @Override
    protected Pizza createPizza(String item) {
            if (item.equals("cheese")) {
                return new ChicagoCheesePizza();
            } else if (item.equals("pepperoni")) {
                return new ChicagoPepperoniPizza();
            } else return null;
    }
}
