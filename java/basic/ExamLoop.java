class ExamLoop {
	public static void main(String[] args)	{
	// 구구단출력
	for (int i = 2; i <= 5; i++)	{
		for (int j =1; j < 10; j++)		{
			System.out.print(i + " X " + j + " = " + i * j);
		}
		System.out.println();
	}
	// 구구단 중 2, 4, 6단만 출력하면서 2단은 2X2, 4단은 4X4, 6단은 6X6까지만 출력(세로로 출력)
	for (int i = 2; i < 7; i += 2)	{
		for (int j = 1; j < 10; j++)	{
			System.out.println(i + " X " + j + " = " + i * j);
			if (i == j) break;
		}
	}
}
}
