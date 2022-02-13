class IfEx {
	public static void main(String[] args) 	{
		int num = 120;
		if (num <0) {
		// num의 값이 0보다 작으면
			System.out.println("0 미만");
		} else {
		// num의 값이 0보다 크거나 같으면
			System.out.println("0 이상");
		
		// 내부의 if문은 기본적으로 외부 if문의 조건을 만족하는 상테에서 동작함
		if (num < 100) {
			System.out.println("0 이상 100미만");
		} else {
			System.out.println("100이상");
		}

		}
		// num변수의 값이 양수이면서 짝수인지를 검사하여 출력하는 if문 작성
		// 출력값 : 120은 양수이면서 짝수

		if ((num > 0) && (num % 2 == 0)) {
			System.out.println(num + " 양수이면서 짝수 ");
		} else {
			System.out.println(num + " 음수이거나 홀수 "); // "음수이면서 홀수"라고 잘못하기 쉬움
	}
	// socre의 점수가 70이상이면 c, 80이상이면 D, 90이상이면 A, 60이상이면 D, 60미만이면 F
	int score = 77;
	if (score >= 70 && score < 80) {
		System.out.println(" C ");
	} else if (score >= 80 && score < 90) 	{
		System.out.println(" B ");
	} else if (score >= 90)	{
		System.out.println(" A ");
	} else if (score >= 60 && score < 70)	{
		System.out.println(" D ");
	} else {
		System.out.println(" F ");
	}
	//혹은
	if (score >= 90) {
		System.out.println(" A ");
	} else if (score >= 80 ) {
		System.out.println(" B ");
	} else if (score >= 70)	{
		System.out.println(" C ");
	} else if (score >= 60)	{
		System.out.println(" D ");
	} else {
		System.out.println(" F ");
}
	// 이상이나 초과의 경우 높은 수부터 차례대로 하면 조건에 부합하지 않는 것을 걷어내면서 내려가기 때문에 쉬움.
}
}