package Hw10_1;

import java.util.ArrayList;

//***************************
// 파일명: MainUsingPizza.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.12
// 내용: SelectToppingPizza 클래스를 사용하는 대신, 데코레이터 객체들을 생성하여 감싸도록 하는 Main 클래스
//***************************

class MainUsingPizza {
    public static void main(String[] args) {
        System.out.println("hw10_1 : 202010629 박상우");
        System.out.println();

    	ArrayList<String> list = new ArrayList<String>();

        // 출력 순서를 맞추기 위해 치즈를 먼저 감싼 후 페퍼로니 추가
        list.add("Cheese");
        list.add("Pepperoni");

//        SelectToppingPizza pizza = new SelectToppingPizza(15); // 완성 후 아래 코드 실행
        // 기본 피자 생성
        AbstractPizza pizza = new Pizza(15);


        // 루프를 돌며 토핑 추가
        for (String topping : list) {
//            pizza.addTopping(topping);  // 완성 후 아래 코드 실행

            if (topping.equals("Cheese")) {
                pizza = new CheeseToppingDecorator(pizza);
            }
            else if (topping.equals("Pepperoni")) {
                pizza = new PepperoniToppingDecorator(pizza);
            }

        	

        }
        System.out.printf("피자: %s, 크기: %d, 가격: %d\n", pizza.getName(), pizza.getSize(), pizza.getPrice());
    }
}
