package Hw9_1;

public class DigitObserver implements Observer {
	  public void update(Subject generator) {
	    System.out.println("DigitObserver:" + generator.getNumber());

	  }
	}

/*
Observer 인터페이스를 구현한 구체적인 관찰자
관찰한 수를 ‘숫자’로 표시
*/