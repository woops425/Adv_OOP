package Hw6_1;

//***************************
// 파일명: CarFactory.java
// 작성자: 202010629 박상우
// 작성일: 2025.10.12
// 내용: 싱글턴 패턴 구현의 핵심부. 수업에서 진행한 2번째 방법(인스턴스를 만드는 메서드에 동기화하는 방법)을 위해,
// private으로 정적 멤버 변수를 선언하지만, 필요할 때 객체가 생성되기 위해 선언만 할 뿐, 생성은 하지 않는다.
//
//***************************
public class CarFactory {
    // private으로 정적 변수 선언, 생성은 아직 하지 않음.
    private static CarFactory instance = null;

    // 10001부터 시작되는 자동차 번호
    private int carNum = 10001;

    // 기본 생성자 선언
    private CarFactory() {}

    // 메서드 동기화. 특정 스레드가 자원을 사용하고 있다면, 다른 스레드에서 자원에 접근할 수 없게끔 제한하여 여러 객체가 생성되는 행위를 차단함.
    public synchronized static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    // 자동차를 생성하는 메서드. getInstance()를 통해 단일 인스턴스 접근은 보장되었지만,
    // 동일한 고유 번호가 여러 개 생기는 걸 방지하기 위해 하나의 스레드만 접근을 허용하도록 했음.
    public Car createCar() {
        synchronized (this) {
            Car car = new Car(carNum);
            carNum++;
            return car;
        }
    }
}
