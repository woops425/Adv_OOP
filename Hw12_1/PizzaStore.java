package Hw12_1;

public abstract class PizzaStore {

	//***************************
// 파일명: ChicagoPizzaStore.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.23
// 내용: 일반 클래스였던 PizzaStore 클래스를 추상 클래스로 변경. 이에 따라, 객체 생성도
	// 해당 클래스에서 담당하던 것을, 객체를 생성하던 메소드를 추상 메소드로 만듦으로써,
	// 객체 생성을 각각 서브 클래스로 위임함.
//***************************
 	public Pizza orderPizza(String type) {

		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
 	
	// Factory Method. 각 Store(ConcreteCreator)에서 구현 Factory Method로 구현해야 함
	protected abstract Pizza createPizza(String item);
}
