package Hw6_1;

public class CarFactoryTest {
    public static void main(String[] args) {
        //***************************
// 파일명: CarFactoryTest.java
// 작성자: 202010629 박상우
// 작성일: 2025.10.12
// 내용: CarFactory, Car 클래스의 구현이 제대로 되었는지 확인하기 위해 테스트 코드가 수행되는 Main 클래스. 싱글턴 패턴을 통해 진행된다.
        //***************************

        System.out.println("hw6_1 : 202010629 박상우");
        System.out.println();

        CarFactory factory = CarFactory.getInstance();	// 싱글톤 패턴

        Car myCar = factory.createCar();				// 메서드에서 Car 생성
        Car yourCar = factory.createCar();


        System.out.println(myCar.getCarNum());		// 10001 출력
        System.out.println(yourCar.getCarNum());		// 10002 출력
    }
}
