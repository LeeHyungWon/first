class ForEx {
	public static void main(String[] args) 	{
		for (int i = 0; i < 3 ; i++) {
			System.out.println("I like Java " + i);
	}
	int n = 1;
	for (; n <= 5 ; n += 2)	{
			System.out.print(n + "  ");
	// �ܺ� ���� ���� for���� ���� ������ ������ �� ����
	}
			System.out.println("\nn : " + n);

	int m ;
	System.out.print(" m : ");
	for (m = 1; m < 5; m += 2)	{	//�ܺ� ���� ���� �ʱ�ȭ�� for�� �ȿ��� �����ص� ����
		System.out.print(m + "  ");
	}
	System.out.println("\nm : " + m);

	for (int i = 0, j = 10; i < 5; i++, j --)	{
		System.out.println("i : " + i + ", j : " + j);
	}
}
}