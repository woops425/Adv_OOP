package Hw7_1;
//***************************
// 파일명: ON.java
// 작성자: 202010629 박상우
// 작성일: 2025.10.15
// 내용: ON 상태에서 on 버튼을 눌렀을 때는 취침등 상태로, off 버튼을 누르면 off 상태로 변환하기 위한 ON state 클래스
//***************************
public class ON implements LightState {
    @Override
    public void on_button_pushed(Light light) {
        System.out.println("취침등 상태");
        light.setState(new SLEEPING());
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light Off!!");
        light.setState(new OFF());
    }
}
