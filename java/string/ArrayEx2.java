class ArrayEx2 {
	public static void main(String[] args) {
		int[] arrInt = {1, 2, 3, 4, 5, 6};
		// �迭�� ���� �� ������ ���ÿ� �ʱ�ȭ ��ų �� ����

		// arrInt �迭�� �������� ���(���η�)
		for (int i = arrInt.length - 1 ; i >= 0 ; i--) {
			System.out.print(arrInt[i] + "  ");
		}	// 6  5  4  3  2  1

		System.out.println();

		// arrInt �迭�� 2, 4, 6 ���� ���(���η�)
		for (int i = 1 ; i < arrInt.length ; i += 2) {
			System.out.print(arrInt[i] + "  ");
		}	// 2  4  6
	}
}
