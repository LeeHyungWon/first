class CondOpEx {
	public static void main(String[] args)  {
		int n1 = 10, n2 = 20, result;
		// n1�� n2�� �� ū ���� result�� �����Ͽ� ���(if�� ���)
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