package Hw12_1;

public class PizzaTestDrive {

//***************************
// 파일명: PizzaTestDrive.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.23
// 내용: 팩토리 메소드를 활용하여 새로 추가된 NY과 Chicago 피자에 대한 피자 주문 코드를 구현한 Main 클래스
//***************************


/*
팩토리 메서드 패턴: 객체를 생성하는 코드를 서브클래스에 위임하여 **느슨한 결합(Loose Coupling)**을 달성하는 데 목적
객체를 생성하는 책임을 슈퍼클래스(Creator*가 아닌 서브클래스(Concrete Creator)가 담당하도록 함.

정의: 객체를 생성하는 인터페이스를 정의하되, 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정하도록 함.
핵심 원리: 클라이언트 코드는 객체를 생성하는 구체적인 클래스를 알 필요 없이, 슈퍼클래스에 정의된 팩토리 메서드(Factory Method)를 호출하여 객체를 얻음.
*/
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

