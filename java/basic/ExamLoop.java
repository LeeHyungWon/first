class ExamLoop {
	public static void main(String[] args)	{
	// ���������
	for (int i = 2; i <= 5; i++)	{
		for (int j =1; j < 10; j++)		{
			System.out.print(i + " X " + j + " = " + i * j);
		}
		System.out.println();
	}
	// ������ �� 2, 4, 6�ܸ� ����ϸ鼭 2���� 2X2, 4���� 4X4, 6���� 6X6������ ���(���η� ���)
	for (int i = 2; i < 7; i += 2)	{
		for (int j = 1; j < 10; j++)	{
			System.out.println(i + " X " + j + " = " + i * j);
			if (i == j) break;
		}
	}
}
}
