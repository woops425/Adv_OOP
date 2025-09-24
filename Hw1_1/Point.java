package Hw1_1;

public class Point implements Resettable {
    //***************************
// 파일명: Point.java
// 작성자: 202010629 박상우
// 작성일: 2025.09.24
// 내용: Resettable 인터페이스를 구현하며, 좌표 이동량과 현재 좌표값을 알려주고, 좌표값 리셋을 위한
// reset() 메소드를 오버라이드하는 Point 클래스
    //***************************

    private double x; // 현재 x좌표
    private double y; // 현재 y좌표
    private final double initialX; // 초기 x좌표(리셋을 위함)
    private final double initialY; // 초기 y좌표(리셋을 위함)

    public Point(double initialX, double initialY) {
        this.x = initialX;
        this.y = initialY;
        this.initialX = initialX;
        this.initialY = initialY;
    }

    // dx : x축 이동량
    // dy : y축 이동량
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
        System.out.println("좌표 이동 : (" + dx + ", " + dy + ")");
    }

    @Override
    public void reset() {
        this.x = this.initialX;
        this.y = this.initialY;
        System.out.println("좌표값 리셋");
    }

    public String toString() {
        return "좌표 : (" + x + ", " + y + ")";
    }
}