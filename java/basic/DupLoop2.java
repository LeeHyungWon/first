class DupLoop2 {
	public static void main(String[] args) 	{
		/* 구구단 중 5단출력
		5 X 1 = 5
		5 x 2 = 10
		...
		5 X 9 = 45
		*/
		for (int i = 1; i < 10; i++)	{
			System.out.println("5 X " + i + " = " + (i * 5));
		}
		// 2~4단까지 출력
		for (int i = 2; i <= 4; i++)	{
			for (int j = 1; j < 10; j++)	{
				System.out.println(i + " X " + j + " = " + (i*j));
			}
			System.out.println();
		}
	}
}
