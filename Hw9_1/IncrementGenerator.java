package Hw9_1;

// 파일명: IncrementGenerator.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.05
// 내용: Subject를 상속하여 수가 점점 증가하는 기능을 구현. 생성자에는 초기값, 최종값, 증가값 세 개의 인자를 받는다.
// 처음에는 현재값을 초기값으로 초기화 한다.
// getNumber() 메서드를 호출하면 현재값을 반환하여 가져온다.


public class IncrementGenerator extends Subject {
    private int initialValue; // 초기값
    private int finalValue; // 최종값
    private int incrementValue; // 증가값
    private int currentNumber; // 현재값

    public IncrementGenerator(int initialValue, int finalValue, int incrementValue) {
        this.initialValue = initialValue;
        this.finalValue = finalValue;
        this. incrementValue = incrementValue;
        this.currentNumber = initialValue; // 현재값을 초기값으로 초기화
    }

    @Override
    public int getNumber() {
        return currentNumber;
    }

    @Override
    public void execute() {
        for (int i = initialValue; i <= finalValue; i += incrementValue) {
            this.currentNumber = i;
            notifyObservers();
        }
    }
}
