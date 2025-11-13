package Hw10_1;

//***************************
// 파일명: SelectToppingPizza.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.12
// 내용: 피자에 추가되는 토핑을 정의한 클래스. 데코레이터 패턴에서 사용하지 않는다.
//***************************
class SelectToppingPizza extends Pizza {
    private boolean pepperoni = false;
    private boolean cheese = false;
    private boolean potato = false;
    private boolean bulgogi = false;
    
    public SelectToppingPizza(int size) {
        super(size);
    }
    
    public void addTopping(String toppingName) {
        switch (toppingName) {
            case "Pepperoni":
                pepperoni = true; break;                

            case "Cheese":
                cheese = true; break;                

            case "Potato":
                potato = true; break;                

            case "Bulgogi":
                bulgogi = true;  break;                

            default:
                System.out.println("Invalid topping\n");
                break;
        }
    }
    public String getName() {
        String name = super.getName();
        if (bulgogi) { name = "불고기 " + name; }
        if (potato) { name = "감자 " + name; }
        if (cheese) { name = "치즈 " + name; }
        if (pepperoni) { name = "페퍼로니 " + name; }
        return name;
    }

    public int getPrice() {
        int price = super.getPrice();
        if (bulgogi) price += ToppingsPrice.BULGOGI;
        if (potato) price += ToppingsPrice.POTATO;
        if (cheese) price += ToppingsPrice.CHEESE;
        if (pepperoni) price += ToppingsPrice.PEPPERONI;
        return price;
    }
}



