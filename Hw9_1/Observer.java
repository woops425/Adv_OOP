package Hw9_1;

//***************************
// 파일명: Observer.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.05
// 내용: 관찰자를 표현하는 인터페이스
//Java의 클래스 라이브러리에 있는 java.util.Observer와는 다르다
//update(NumberGenerator)
//NumberGenerator가 “나의 내용이 갱신되었습니다. 표시도 갱신해주세요”라고 관찰자에게 알려줄 때 호출하는 메소드
//***************************

public interface Observer {
	public abstract void update(Subject generator);
}