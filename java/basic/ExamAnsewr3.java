class ExamAnsewr3 {
	public static void main(String[] args) 	{
	// SwitchEx.java 파일에 있는 모든 switch문을 if문으로 변경
	int num = 2;
	if (num == 1 ) 	{
		System.out.println("num변수의 값은 1");
	} else if (num==2)	{
		System.out.println("num변수의 값은 2");
	} else if (num==3)	{
		System.out.println("num변수의 값은 3");
	} else {
		System.out.println("num변수의 값은 모름");
	}

	if (num >= 1 && num < 3) {
		System.out.println("상");
	} else if (num >= 4 && num < 6)	{
		System.out.println("중");
	} else {
		System.out.println("하");
	}	

}
}