class WhileDoEx {
	public static void main(String[] args) 	{
		int num =0;
		while (num < 3)	{
			System.out.println("I like Java " + num);
		num++;
		// num++�� ���ϸ� num�� ��� 0�̴ϱ� ���ѷ����� ���Ƽ� [I like Java 0] ���� ��� ������.
		}

		// ���� 1���� 100������ ���� while���� �̿��Ͽ� ���� �� ���
/*		num = 1;
		int sum = 0; // ���� ����� �ݵ�� �ʱ�ȭ�� ����� ��
		while (num <= 100)	{
			sum += num;
			num++;
			System.out.println("1���� 100������ �� : " + sum);
			System.out.println("num  : " + num); 
		} */
		num = 1;
		while (num < 10)	{
			System.out.println("I like Java " + num);
			num += 2;
		}
		do	{
			System.out.println("I like Java " + num);
			num += 2;
		} while (num < 10);

}
}
