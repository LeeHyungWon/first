class MethodReturn2 {
	public static void main(String[] args) 	{
		divide(4, 2);	 // 2
		divide(0, 2);	 // 0
		divide(4, 0);	 // ��� �Ҵ�(ArithmeticException/���ܹ߻�) <- �������� ��.
		}
	public static void divide(int n1, int n2) {
		if (n2 == 0)		{
			System.out.println("0���δ� ���� �� �����ϴ�.");
			return;  // void�޼ҵ忡�� ����� ��� �޼ҵ带 ������ �����Ŵ (���� �߻��� �� �۾��ߴ�)
		}
		System.out.println("������ ��� : " + n1 / n2);
	}
}