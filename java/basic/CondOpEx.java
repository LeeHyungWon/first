class CondOpEx {
	public static void main(String[] args)  {
		int n1 = 10, n2 = 20, result;
		// n1과 n2중 더 큰 수를 result에 저장하여 출력(if문 사용)
		if (n1 > n2)  {
			result = n1;
		} else {
			result = n2;
		}
		System.out.println(" result1 : " + result);

		result = n1;
		if(n2 > n1) result = n2;
		System.out.println(" result2 : " + result);
		
		result = n1 > n2 ? n1 : n2;
		System.out.println(" result3 : " + result);

		System.out.println(" result4 : " + (n1 > n2 ? n1 : n2));

}
}