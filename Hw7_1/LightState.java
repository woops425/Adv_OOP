package Hw7_1;
//***************************
// 파일명: LightState.java
// 작성자: 202010629 박상우
// 작성일: 2025.10.15
// 내용: 각각의 State 클래스에서 구현하기 위한 on, off에 대한 메서드를 정의한 LightState 인터페이스
//***************************
public interface LightState {
    public void on_button_pushed(Light light);
    public void off_button_pushed(Light light);
}
