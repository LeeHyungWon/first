class WhileDoEx {
	public static void main(String[] args) 	{
		int num =0;
		while (num < 3)	{
			System.out.println("I like Java " + num);
		num++;
		// num++을 안하면 num은 계속 0이니까 무한루프를 돌아서 [I like Java 0] 값이 계속 생성됨.
		}

		// 정수 1부터 100까지의 합을 while문을 이용하여 구한 뒤 출력
/*		num = 1;
		int sum = 0; // 누적 연산시 반드시 초기화를 해줘야 함
		while (num <= 100)	{
			sum += num;
			num++;
			System.out.println("1부터 100까지의 합 : " + sum);
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
