package study.chap03;

// ?Όλ¦¬μ°?°? : ?λ°? A && B, A || B, !A, A & B, A | B
// C?Έ?΄ : !, &&, ||

public class Logical {

	public static void main(String[] args) {
		int num = 10;
		int var1 = 20;
		int a;
		int b = 10;
		
		// A && B
		// Aκ°? false?΄λ©? Bκ°? true ?Έμ§? false?Έμ§? ??¨??κ³? ?€???¨
		boolean flag = ((a = num) > 11) && ((b = var1) < 20);
		// A : ((a = num) > 11), B : ((b = var1) < 20)
		System.out.println("flag="+ flag + ",a=" + a + ", b=" + b);

		// ?λ°μ? μΆκ?? κΈ°λ₯ : Aκ°? false ?΄??Ό? Bκ°? true ?Έμ§? false?Έμ§? ??¨
		flag = ((a = num) > 11) & ((b = var1) < 20);
		System.out.println("flag="+ flag + ",a=" + a + ", b=" + b);

	}

}
