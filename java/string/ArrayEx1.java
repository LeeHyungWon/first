class ArrayEx1 {
	public static void main(String[] args) {
		int[] arrInt = new int[3];	// int�� ������ 3���� ������ �� �ִ� arrInt��� �迭 ����
		arrInt[0] = 10;	// arrInt�迭�� 0�� �ε��� ĭ�� 10�� ����
		arrInt[1] = 20;
		arrInt[2] = 30;
		int sum = arrInt[0] + arrInt[1] + arrInt[2];
		System.out.println("sum : " + sum);

		String[] arrStr = new String[3];	// String�� ������ 3���� ������ �� �ִ� arrStr�̶�� �迭 ����
		arrStr[0] = "Java";
		arrStr[1] = "JSP";
		arrStr[2] = "Servlet";
		for (int i = 0 ; i < arrStr.length ; i++) {
		// length : �迭������ length�� �޼ҵ尡 �ƴ� �Ӽ�(field)���� �迭�� ũ�⸦ �ǹ�
			System.out.println(arrStr[i]);
		}

		// arrStr �迭�� ����ִ� ���ڿ��� ù��° ���ڸ� ���
		for (int i = 0 ; i < arrStr.length ; i++) {
			System.out.println(arrStr[i].charAt(0));
		}

		String str = "010-1234-5678";
		String[] arrPhone = str.split("-");
		// str�� ���ڿ��� ������(-)�� �������� �߶� String �迭�� ����
		for (int i = 0 ; i < arrPhone.length ; i++) {
			System.out.println(arrPhone[i]);
		}
	}
}
