package Hw6_1;

//***************************
// 파일명: Car.java
// 작성자: 202010629 박상우
// 작성일: 2025.10.12
// 내용: 제작될 때 마다 부여되는 고유 번호 필드를 구현하기 위한 Car 클래스. 생성자와 carNum을 반환하는 getter로 구성되어 있다
//***************************
public class Car {
    private int carNum;

    public Car(int carNum) {
        this.carNum = carNum;
    }

    public int getCarNum() {
        return carNum;
    }
}
