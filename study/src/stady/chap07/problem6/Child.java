package stady.chap07.problem6;

public class Child extends Parent {
	private String name;
	
	public Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name=name;
		System.out.println("Child(String name)call");
	}
}