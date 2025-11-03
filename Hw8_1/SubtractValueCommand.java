package Hw8_1;

//***************************
// 파일명: CommandManager.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.03
// 내용: 산술연산 중, 뺄셈 연산 기능을 구현하는 SubtractValueCommand 클래스
//***************************
public class SubtractValueCommand implements Command {
    private int a;
    private int b;

    public SubtractValueCommand(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute() {
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }
}
