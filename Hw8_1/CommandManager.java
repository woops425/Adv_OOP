package Hw8_1;

import java.util.ArrayList;

//***************************
// 파일명: CommandManager.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.03
// 내용: 산술연산(덧셈, 뺄셈, 제곱)을 ArrayList에 addOperation() 메서드를 통해 넣었다가,
//  performOperations() 메서드를 통해 산술연산을 순차적으로 처리하는 CommandManager 클래스
//***************************
public class CommandManager {
    private ArrayList<Command> commandArrayList = new ArrayList<Command>();

    // 실행할 산술 연산을 리스트에 추가
    public void addOperation(Command command) {
        commandArrayList.add(command);
    }

    public void performOperations() {
        for (Command command : commandArrayList) {
            command.execute();
        }
    }
}
