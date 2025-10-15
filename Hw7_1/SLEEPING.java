package Hw7_1;
//***************************
// 파일명: SLEEPING.java
// 작성자: 202010629 박상우
// 작성일: 2025.10.15
// 내용: SLEEPING 상태에서 on 버튼을 눌렀을 때는 다시 on 상태로, off 버튼을 누르면 off 상태로 변환하기 위한 ON SLEEPING 클래스
//***************************
public class SLEEPING implements LightState {
    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light On Back!!");
        light.setState(new ON());
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light Off!!");
        light.setState(new OFF());
    }
}
