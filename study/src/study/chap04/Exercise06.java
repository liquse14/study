package study.chap04;

public class Exercise06 {

	public static void main(String[] args) {
		for(int i = 1;i <= 5;i++) {
			// 한줄 출력
			for(int j = 0;j < i;j++) {	// 별 출력
				System.out.print("*");
			}
			// 줄바꾸기
			System.out.println();	//
		}
	}

}
