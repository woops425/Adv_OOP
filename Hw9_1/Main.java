package Hw9_1;

//***************************
// 파일명: Main.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.05
// 내용: Observer 패턴의 기능을 실행하는 Main 클래스

	/*느슨한 결합 (Loose Coupling): DigitObserver와 GraphObserver는 숫자가 어떻게 생성되는지(RandomGenerator인지 IncrementGenerator인지) 전혀 알지 못함

	유연한 확장: Subject(발행자)의 로직을 RandomGenerator에서 IncrementGenerator로 완전히 교체했지만, Observer(구독자) 측의 코드는 단 한 줄도 수정할 필요가 없었음.

	단일 책임: Subject는 자신의 상태가 변경되었음을 알리는(notify) 책임만 짐. Observer는 알림을 받으면 데이터를 가져와(generator.getNumber()) 화면에 표시하는(update) 책임만 짐.

	이처럼 상태를 가진 객체(Subject)와 상태를 관찰하는 객체(Observer)를 분리하여 서로에게 미치는 영향을 최소화하는 것이 옵저버 패턴의 핵심
	*/
//***************************
public class Main {
	  public static void main(String[] args) {
		  System.out.println("hw9_1 : 202010629 박상우");
		  System.out.println();
//	    Subject generator = new RandomGenerator();
	     Subject generator = new IncrementGenerator(10, 40, 4);
	    Observer observer1 = new DigitObserver();
	    Observer observer2 = new GraphObserver();

	    generator.addObserver(observer1);
	    generator.addObserver(observer2);

	    generator.execute();
	  }

	}
