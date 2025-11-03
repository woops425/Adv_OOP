package Hw8_1;

//***************************
// 파일명: CommandManager.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.03
// 내용: 산술연산 중, 제곱 연산 기능을 구현하는 SquareValueCommand 클래스
//***************************
public class SquareValueCommand implements Command {
    private int a;

    public SquareValueCommand(int a) {
        this.a = a;
    }

    @Override
    public void execute() {
        int result = (int) Math.pow(a, 2);
        System.out.println("pow(" + a + ",2)" + " = " + result);
    }
}
