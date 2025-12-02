package Hw6_1;

public class CarFactoryTest {
    public static void main(String[] args) {
        //***************************
// 파일명: CarFactoryTest.java
// 작성자: 202010629 박상우
// 작성일: 2025.10.12
// 내용: CarFactory, Car 클래스의 구현이 제대로 되었는지 확인하기 위해 테스트 코드가 수행되는 Main 클래스. 싱글턴 패턴을 통해 진행된다.

/*
싱글턴 패턴의 핵심
1. 인스턴스를 하나만 생성
클래스 외부에서 new 연산자를 통해 인스턴스를 생성하는 것을 막는다.자기 자신의 타입을 가지는 정적(static) 변수를 클래스 내부에 두어, 이 변수가 유일한 인스턴스를 저장한다.

2. 전역 접근점 제공
유일한 인스턴스를 얻을 수 있는 정적 메서드(getInstance() 등)를 제공한다.이 메서드는 처음 호출될 때만 인스턴스를 생성하고, 이후에는 기존에 생성된 인스턴스를 반환한다.

장점
자원 절약 및 성능 향상: 인스턴스가 하나만 존재하므로 메모리 낭비를 줄이고, 객체를 생성하는 오버헤드를 막을 수 있다.
데이터 일관성: 모든 클래스가 동일한 인스턴스를 공유하므로 데이터의 일관성을 유지하기 쉽다.

단점
멀티스레딩 문제: 여러 스레드가 동시에 getInstance()를 호출할 때 인스턴스가 여러 개 생성될 위험이 있어 스레드 안전성을 고려해야 한다. (Locking, Double-Checked Locking 등의 추가 구현 필요)
테스트의 어려움: 싱글턴은 전역 상태를 가지므로, 테스트 환경을 독립적으로 구성하기 어렵고 모의 객체로 대체하기 까다로울 수 있다.
객체 지향 원칙 위반: 전역 변수처럼 사용되어 객체 간의 결합도(Coupling)를 높일 수 있다.
*/
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
