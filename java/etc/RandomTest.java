import java.util.*;

class RandomTest {
	public static void main(String[] args) {
		// 1~10������ ������ �� 3���� �������� �����Ͽ� ��� : ��, Ȧ���� ¦������ �� �� ���� Ȯ���� ���;� ��
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 3, 5, 7, 9};
		Random rnd = new Random();
		for (int i = 0 ; i < 3 ; i++) {
			System.out.print(arr[rnd.nextInt(15)] + " ");
		}
	}
}
