package study.chap06.static_member;

public class Calculator {
	// ���� �ʵ�
	static double pi = 3.14159;
	
	// ���� �޼ҵ�
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	static double calculateArea(double radius) {
		return pi * radius * radius;
	}
}