package Hw9_1;

//***************************
// 파일명: Main.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.05
// 내용: Observer 패턴의 기능을 실행하는 Main 클래스
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