import java.util.*;

class ArrayMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(i + 1 + "��° ���� : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("�ּҰ� : " + minValue(arr));
		System.out.println("�ִ밪 : " + maxValue(arr));
	}
	public static int minValue(int[] arr) {
	// �޾ƿ� �迭���� �ּҰ��� ���Ͽ� �����ϴ� �޼ҵ�
	}
	public static int maxValue(int[] arr) {
	// �޾ƿ� �迭���� �ִ밪�� ���Ͽ� �����ϴ� �޼ҵ�
	}
}
