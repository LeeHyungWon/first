class BreakContinue {
	public static void main(String[] args) 	{
		// 100이하의 자연수 중 5와 7의 최소공배수를 구하여 출력 - while문 이용
		int num = 1, num2 = 0;

		while (num <= 100)	{
			if (num % 5 == 0 && num % 7 ==0) {
				num2 = num;
				break;
			}
			num++;
			}
			System.out.println("5와 7의 최소공배수 : " + num);

			// 100이하의 자연수 중 5와 7의 공배수와 그 개수를 구하여 출력 -while문 이용
			num = 0;	// 100루프를 돌릴 변수
			int count = 0; // 5와 7의 공배수 개수를 저장할 변수
			while (num <= 100)	{
				num++; // num++이 continue 밑으로 내려가면 아랫쪽 실행문으로 들어가서 무시하게 됨.
				if (num % 5 != 0 || num % 7 != 0)	{ //if (!(num % 5 == 0 && num % 7 ==0)) << 이렇게 해도됨.
					continue ; 
					// 5 or 7로 나눈 나머지가 0이 아닐경우 아랫쪽 실행문들은 무시하고 조건절(while조건)로 바로 올라감
				}
				count++;
				System.out.println("5와 7의 최소공배수 : " + num);
			}
			System.out.println("5와 7의 공배수 개수: " + count);
	}
}