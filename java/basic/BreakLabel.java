class  BreakLabel {
	public static void main(String[] args) 	{
		// i�� j�� ���� �� �� ¦���� ��� ����� ����
		for (int i = 1; i < 4; i ++)	{
			for (int j = 1; j < 4; j++)	{
				System.out.print("[" + i + ", " + j + "] ");
				if (i % 2 == 0 && j % 2 == 0) break;	{ 
				// [1, 1] [1, 2] [1, 3] [2, 1] [2, 2] [3, 1] [3, 2] [3, 3] �̷������� ��µ�
				// ��ø ���������� break�� ����ϸ� ���� ���� ���������� ��������
				}
			}
			}

			System.out.println("\n-----------------------------------------------------------");

	outerLoop : // Ư�� �������� ǥ�����ִ� ���̺�(label)
		for (int i = 1; i < 4; i ++)	{
			for (int j = 1; j < 4; j++)	{
				System.out.print("[" + i + ", " + j + "] ");
					if (i % 2 == 0 && j % 2 == 0) break outerLoop;	{ 
					// [1, 1] [1, 2] [1, 3] [2, 1] [2, 2]  �̷������� ��µ�
					// outerLoop��� ǥ���� ���� �������� ��������
}
}
}
}
}