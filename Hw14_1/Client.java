package Hw14_1;

public class Client {
	//***************************
// 파일명: Client.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.26
// 내용: 과제로 올라온 소스코드를 수정하여 컴포지트 패턴을 적용하여 단순화 한 코드의 실행부분.
/*
컴포지트 패턴은 객체들을 트리 구조로 구성하여, 개별 객체(Leaf)와 객체들의 집합(Composite)을 클라이언트가 동일하게 다룰 수 있도록 하는 구조적 디자인 패턴임.
이 패턴의 핵심 목적은 부분과 전체의 관계를 표현하고, 사용자가 개별 객체와 복합 객체를 구별하지 않고 일관된 방식으로 처리할 수 있게 하는 것.
파일 시스템의 디렉토리(폴더)와 파일 구조가 이 패턴의 가장 대표적인 예시임.

패턴의 장점
일관성 (Uniformity): 클라이언트는 개별 객체(Leaf)와 복합 객체(Composite)를 구별할 필요 없이 Component 인터페이스를 통해 동일한 방식으로 모든 요소를 처리할 수 있음.
단순성: 계층 구조를 처리하는 코드가 단순해진다. Directory 내부에 File이 있는지 Directory가 있는지 구분할 필요 없이, 단순히 Component.print()나 Component.getSize()와 같이 공통 메서드를 호출하면 된다.
확장성: 새로운 종류의 Leaf나 Composite를 추가하기 쉽다. 새 클래스는 Component를 상속받기만 하면 된다.
*/
//***************************
	public static void main(String[] args) {
		System.out.println("hw14_1 : 202010629 박상우");
		System.out.println();

		Directory dir1 = new Directory("root") ;
		Directory dir2 = new Directory("Dir1") ;
		
		File f1 = new File("f1", 100) ;
		File f2 = new File("f2", 200) ;
		File f3 = new File("f3", 300) ;
		File f4 = new File("f4", 400) ;
		
		dir1.addEntry(f1) ;
		dir1.addEntry(dir2) ;
		dir2.addEntry(f2) ;
		dir2.addEntry(f3) ;
		dir1.addEntry(f4) ;

		dir1.print() ;
	}
}

