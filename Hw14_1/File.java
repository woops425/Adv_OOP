package Hw14_1;
//***************************
// 파일명: File.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.26
// 내용: Entry 추상 클래스를 상속한다. Leaf 역할을 맡는 클래스. Entry 클래스의 getSize(), print()를 오버라이딩한다.
//***************************
public class File extends Entry {
	private int size ;

	public File(String name, int size) {
		super(name);
		this.size = size ;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void print() {
		printIndent();
		System.out.println("[File] " + name + ", Size: " + size) ;
	}
}
