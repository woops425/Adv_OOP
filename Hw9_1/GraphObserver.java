package Hw9_1;

// 파일명: GraphObserver.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.05
// 내용:
//Observer 인터페이스를 구현한 구체적인 관찰자
//관찰한 수를 ‘간단한 그래프’로 표시함
//관찰한 숫자만큼의 ‘*‘를 출력


public class GraphObserver implements Observer {
	  public void update(Subject generator) {
	    System.out.print("GraphObserver:");
	    int count = generator.getNumber();
	    for (int i=0; i<count; i++) {
	      System.out.print("*");
	    }
	    System.out.println("");
	  }
	}

