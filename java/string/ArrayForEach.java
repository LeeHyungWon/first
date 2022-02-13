class ArrayForEach {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int sum = 0;
		for (int i = 0 ; i < arr.length ; i++)	sum += arr[i];
		System.out.println("�迭 ��ҵ��� ��(for) : " + sum);

		sum = 0;
		for (int e : arr)	sum += e;
		// arr�迭�� ��� ��ҵ��� ���ʴ�� ���� e�� �ְ� ������ ��(������ ó������ ������ ������ ��)
		System.out.println("�迭 ��ҵ��� ��(for-each) : " + sum);

		for (int e : arr) {
			e++;	// arr�迭�� ���� e�� ��� 1����(������ ���� ������ ����)
			System.out.print(e + " ");	// 2 3 4 5 6
		}
		System.out.println();
		for (int e : arr)	System.out.print(e + " ");	// 1 2 3 4 5
		System.out.println();

		for (int i = 0 ; i < arr.length ; i++) {
			arr[i]++;	// arr�迭���� i�ε����� �ش��ϴ� ���� 1����(���� ����)
			System.out.print(arr[i] + " ");	// 2 3 4 5 6
		}
		System.out.println();
		for (int i = 0 ; i < arr.length ; i++)	System.out.print(arr[i] + " ");	// 2 3 4 5 6
		System.out.println();

		String[] arrStr = {"a", "b", "c", "d"};
		for (String e : arrStr)	System.out.print(e + " ");	// a b c d
		System.out.println();

		for (String e : arrStr) {
			e = e + "-";
			System.out.print(e + " ");	// a- b- c- d-
		}
		System.out.println();

		for (String e : arrStr)	System.out.print(e + " ");	// a b c d
		System.out.println();
	}
}
