class BreakContinue {
	public static void main(String[] args) 	{
		// 100������ �ڿ��� �� 5�� 7�� �ּҰ������ ���Ͽ� ��� - while�� �̿�
		int num = 1, num2 = 0;

		while (num <= 100)	{
			if (num % 5 == 0 && num % 7 ==0) {
				num2 = num;
				break;
			}
			num++;
			}
			System.out.println("5�� 7�� �ּҰ���� : " + num);

			// 100������ �ڿ��� �� 5�� 7�� ������� �� ������ ���Ͽ� ��� -while�� �̿�
			num = 0;	// 100������ ���� ����
			int count = 0; // 5�� 7�� ����� ������ ������ ����
			while (num <= 100)	{
				num++; // num++�� continue ������ �������� �Ʒ��� ���๮���� ���� �����ϰ� ��.
				if (num % 5 != 0 || num % 7 != 0)	{ //if (!(num % 5 == 0 && num % 7 ==0)) << �̷��� �ص���.
					continue ; 
					// 5 or 7�� ���� �������� 0�� �ƴҰ�� �Ʒ��� ���๮���� �����ϰ� ������(while����)�� �ٷ� �ö�
				}
				count++;
				System.out.println("5�� 7�� �ּҰ���� : " + num);
			}
			System.out.println("5�� 7�� ����� ����: " + count);
	}
}