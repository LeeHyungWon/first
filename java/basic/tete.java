class tete {
	public static void main(String[] args) 	{
		int sum = 0;
		for (int i = 0; i <= 100; i++)	{
			sum += i;
		}
    System.out.println("1부터 100까지의 합 : " + sum);  

		sum = 0;
		for (int j = 0; j <=100; j++)	{
			if (j % 2 == 0)	{
				sum += j;
			} 
	
}
	System.out.println("1부터 100까지의 짝수의 합 : " + sum);  
		
		sum = 0;
		for (int z = 0; z <= 50; z++)	{
			sum += z*2;
		}
	System.out.println("1부터 100까지의 짝수의 합 : " + sum);  

}
}