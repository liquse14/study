package study.chap05;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] array = {
				{ 95, 86 },
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		// �ۼ� ��ġ
		// �࿡ ���Ͽ� �ݺ�
		for(int i = 0;i < array.length;i++) {	// �࿡ ���Ͽ� : i (��) 0~2
			count += array[i].length;
			// ���� ���Ͽ� �ݺ�
			for(int j = 0;j < array[i].length;j++) {	// �࿡ ���� �� : j
				// i = 0, j : 0~1 array[0].length=2
				// i = 1, j : array[1].length=3 0~2
				// i = 2, j : array[2].length=5 0~4
				sum += array[i][j];
				//count++;
			}
		}
		// ���
		avg = (double)sum / count;	// ��������ȯ : int -> double
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}