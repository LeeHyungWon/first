import java.util.*;

class StringTokenizerEx {
	public static void main(String[] args) {
		String data = "11 22 33";

		// data�� ������ �迭�� �̿��Ͽ� ���
		String[] arr = data.split(" ");	// data�� ���ڿ��� �ݷ��� �������� �߶� ���ڿ� �迭�� ����
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}

		StringTokenizer st = new StringTokenizer(data);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}	// ������ �� ���� �� �� ������, �� ���ƾ� �ϴ� ��쿡�� ���� ����ų� �迭�� ��Ƽ� ����ؾ� ��

		String str = "1+2-3*4/5";
		StringTokenizer st1 = new StringTokenizer(str, "+-*/");
		// �����ڷ� ���� ���ڸ� �Է��ϸ� �� ���ں��� �����ڷ� ��޵�
		// StringTokenizer ������ �����ڴ� �� ���ڸ� ���ǹǷ� ���� ���� �Է½� �� ���ں��� �����ڷ� ����
		while (st1.hasMoreTokens()) {
			System.out.print(st1.nextToken() + "  ");	// 1  2  3  4  5
		}
		System.out.println();

		StringTokenizer st2 = new StringTokenizer(str, "+-*/", true);
		// true : �����ڵ鵵 ��ū���� ����Ͽ� ��°���
		while (st2.	hasMoreElements()) {
			System.out.print(st2.nextElement() + "  ");	// 1  +  2  -  3  *  4  /  5
		}
	}
}
