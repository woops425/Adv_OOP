package Hw14_1;

public class Client {
	//***************************
// 파일명: Client.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.26
// 내용: 과제로 올라온 소스코드를 수정하여 컴포지트 패턴을 적용하여 단순화 한 코드의 실행부분.
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
