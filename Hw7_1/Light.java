package Hw7_1;
//***************************
// 파일명: Light.java
// 작성자: 202010629 박상우
// 작성일: 2025.10.15
// 내용: 현재 상태(state)를 저장하는 Light 클래스. setter와 on 버튼, off 버튼을 눌렀을 때의 상태를 반환해준다
//***************************
public class Light {
    private LightState state;

    public Light() {
        state = new OFF();
    }
    public void setState(LightState state) {
        this.state = state;
    }

    public void on_button_pushed() {
        state.on_button_pushed(this);
    }
    public void off_button_pushed() {
        state.off_button_pushed(this);
    }
}
