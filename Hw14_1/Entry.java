package Hw14_1;

//***************************
// 파일명: Entry.java
// 작성자: 202010629 박상우
// 작성일: 2025.11.26
// 내용: 컴포지트 패턴 구현을 위해 추가된 추상 클래스. Directory 클래스에 있던 부분 중, Leaf와 Composite가 모두 사용해야 하는 부분은 추상 메소드로 구현했다.
// 그 외의 기능, 즉, Composite에서만 사용하는  메소드들은 추상 메소드로 정의하지 않았다.
//***************************
public abstract class Entry {
    protected String name ;
    protected int depth = 0 ;

    public Entry(String name) {
        this.name = name;
    }

    // Leaf와 Composite가 공통으로 사용해야 하는 메소드
    public abstract int getSize();
    public abstract void print();

    public void addEntry(Entry entry) {}
    public void removeEntry(Entry entry) {}

    public String getName() {
        return name;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    protected void printIndent() {
        for (int i=0; i<depth; i++) {
            System.out.print("\t");
        }
    }
}
