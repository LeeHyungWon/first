class  MethodReturn3 {
	public static void main(String[] args) 	{
		char grade = getGrade(78);
		System.out.println(" ������ '" + grade + "' ���� �Դϴ�.");
	}
	public static char getGrade(int score) {
		if (score >= 90 )	{
			return 'A';
		} else if (score >= 80 )	{
			return 'B';
		} else if (score >= 70 )	{
			return 'C';
		} else if (score >= 60 )	{
			return 'D';
		} else {
			return 'F';
	}
	// if�� �ȿ��� return�� �� ��� �ݵ�� else���� �ְų� if�� �ۿ��� return �ؾ���.
}
			// 5�� 7�� �ּ� ������� ���ϴ� �޼ҵ�
		int num = getNumber1();
	public static int getNumber1()	{
		for (int i = 1; i <= 100 ; i++)		{
			if (i % 5 == 0 && i % 7 == 0)		{
				return i;
			} else {
				return 0;
			}
				return 0; // ���������� return�� ��� �ݵ�� ������ �ۿ��� return�� �� �� �� ����� ��.
						  // ������ ��ü�� ���� ���� ������ �����Ƿ� ���ǿ� ����Ǹ� �ƿ� return�� �ȵɼ� �ֱ� ������
		System.out.println("5�� 7�� �ּ� ����� : " + num);
}
}
}