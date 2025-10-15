package Hw7_1;
//***************************
// 파일명: OFF.java
// 작성자: 202010629 박상우
// 작성일: 2025.10.15
// 내용: OFF 상태에서 on 버튼을 눌렀을 때는 on 상태로, off 버튼을 누르면 이미 off 상태이므로 반응 없음을 출력하는 OFF state 클래스
//***************************
public class OFF implements LightState {
    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light On!!");
        light.setState(new ON());
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("반응 없음");
        light.setState(new OFF());
    }
}
