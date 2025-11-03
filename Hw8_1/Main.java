package Hw8_1;

//***************************
// 파일명: Main.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.03
// 내용: CommandManager에 객체를 추가하고 실행하는 Main 클래스
//***************************
public class Main {
    public static void main(String[] args) {
        System.out.println("hw8_1 : 202010629 박상우");
        System.out.println();

        CommandManager mgr = new CommandManager();
        mgr.addOperation(new AddValueCommand(2, 3));
        mgr.addOperation(new SubtractValueCommand(2, 3));
        mgr.addOperation(new SquareValueCommand(3));

        // 추가된 산술 연산 실행
        mgr.performOperations();

    }
}
