import java.util.*;

class ArrayMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(i + 1 + "번째 정수 : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("최소값 : " + minValue(arr));
		System.out.println("최대값 : " + maxValue(arr));
	}
	public static int minValue(int[] arr) {
	// 받아온 배열에서 최소값을 구하여 리턴하는 메소드
	}
	public static int maxValue(int[] arr) {
	// 받아온 배열에서 최대값을 구하여 리턴하는 메소드
	}
}
