package Hw14_1;

import java.util.ArrayList;
import java.util.List;

//***************************
// 파일명: Directory.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.26
// 내용: Composite 부분에 해당하는 클래스. Entry 추상 클래스를 상속받고, 기능들을 오버라이딩한다.
//***************************
public class Directory extends Entry {

	private List<Entry> entries = new ArrayList<Entry>() ;

	public Directory(String name) {
		super(name);
	}

	@Override
	public void addEntry(Entry entry) {
		entries.add(entry);

		entry.setDepth(depth + 1);
	}

	@Override
	public void removeEntry(Entry entry) {
		entries.remove(entry);
	}
	
	@Override
	public int getSize() {
		int size = 0;
		for (Entry entry : entries) {
			size += entry.getSize();
		}
		return size;
	}

	@Override
	public void print() {
		printIndent();
		System.out.println("[Directory] " + name + ", Size: " + getSize()) ;
		
		for ( Entry entry: entries ) {
			entry.print();
		}
	}
}
