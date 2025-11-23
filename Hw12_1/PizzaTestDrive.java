package Hw12_1;

public class PizzaTestDrive {

//***************************
// 파일명: PizzaTestDrive.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.23
// 내용: 팩토리 메소드를 활용하여 새로 추가된 NY과 Chicago 피자에 대한 피자 주문 코드를 구현한 Main 클래스
//***************************

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		PizzaStore store = new PizzaStore();
//
//		Pizza pizza = store.orderPizza("cheese");
//		System.out.println("We ordered a " + pizza.getName() + "\n");
//
//
//		pizza = store.orderPizza("pepperoni");
//		System.out.println("We ordered a " + pizza.getName() + "\n");
//
//
		// 2개의  Store 구현 후 아래 주석된 코드 실행
		System.out.println("hw12_1 : 202010629 박상우");
		System.out.println();

		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("we ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("we ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("we ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("we ordered a " + pizza.getName() + "\n");

		
	}

}
