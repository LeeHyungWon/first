class  BreakLabel {
	public static void main(String[] args) 	{
		// i와 j의 값이 둘 다 짝수일 경우 출력을 멈춤
		for (int i = 1; i < 4; i ++)	{
			for (int j = 1; j < 4; j++)	{
				System.out.print("[" + i + ", " + j + "] ");
				if (i % 2 == 0 && j % 2 == 0) break;	{ 
				// [1, 1] [1, 2] [1, 3] [2, 1] [2, 2] [3, 1] [3, 2] [3, 3] 이런식으로 출력됨
				// 중첩 루프문에서 break를 사용하면 현재 속한 루프문만을 빠져나감
				}
			}
			}

			System.out.println("\n-----------------------------------------------------------");

	outerLoop : // 특정 루프문을 표시해주는 레이블(label)
		for (int i = 1; i < 4; i ++)	{
			for (int j = 1; j < 4; j++)	{
				System.out.print("[" + i + ", " + j + "] ");
					if (i % 2 == 0 && j % 2 == 0) break outerLoop;	{ 
					// [1, 1] [1, 2] [1, 3] [2, 1] [2, 2]  이런식으로 출력됨
					// outerLoop라는 표식을 가진 루프문을 빠져나감
}
}
}
}
}