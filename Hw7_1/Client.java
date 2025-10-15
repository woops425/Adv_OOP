package Hw7_1;

public class Client {
    public static void main(String[] args) {
        //***************************
// 파일명: Client.java
// 작성자: 202010629 박상우
// 작성일: 2025.10.15
// 내용: LightState 인터페이스를 활용한 각각의 상태에 대한 실행 결과를 확인하기 위한 Client Main 클래스
        //***************************

        System.out.println("hw7_1 : 202010629 박상우");
        System.out.println();
        Light light = new Light(); // 기본 설정값 : OFF 상태
        light.on_button_pushed(); // Light on
        light.on_button_pushed(); // Sleeping
        light.on_button_pushed(); // Light on back
        light.off_button_pushed(); // Light off
        light.on_button_pushed(); // Light on
    }
}
