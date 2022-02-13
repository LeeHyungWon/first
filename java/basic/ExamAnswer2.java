class ExamAnswer2 {
	public static void main(String[] args) 	{
		int num = 8;
		// num에 들어있는 숫자값을 이용하여 세가지 종류의 작업을 실행하는 switch문 작성
		// 가족의 구성원의 수가 1명이면 독신, 2명이면 2인가구, 3명~6명은 평균 가족 구성원, 7명 이상은 대가족 구성원 
		switch (num)	{
			case  1 :
				System.out.println("독신");		break;
			case  2 :
				System.out.println("2인가구");		break;
			case  3 : case  4 : case  5 : case  6 : 
				System.out.println("평균 가족 구성원");		break;
			case  7 : case  8 : case  9 : case  10 : 
				System.out.println("대가족구성원");		break;
	}
}
}