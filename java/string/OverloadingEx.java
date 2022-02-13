class StudentInfo {
// 학생정보를 저장할 클래스 : 하나의 인스턴스가 한 명의 학생을 의미
	private int stID, korean, math, art;
	StudentInfo(int stID, int korean, int math, int art) {
		this.stID = stID;	this.korean = korean;	this.math = math;	this.art = art;
		// 멤버변수와 매개변수의 이름이 같으면 this를 이용하여 멤버변수를 구분해 줌
		// this. : '현재 생성되고 있는 인스턴스의~'를 의미하는 명령
	}
	StudentInfo(int stID, int korean, int math) {
		this(stID, korean, math, -1);
		// 매개변수를 인수로 하여 다른 생성자를 호출
		// 다른 생성자를 호출하는 것은 오직 생성자안에서 this()를 이용하는 방법뿐임
	}
	public void showInfo() {
		System.out.println("학번 : " + stID);
		System.out.println("국어 : " + korean);
		System.out.println("수학 : " + math);
		if (art == -1)	System.out.println("미술 수업을 듣지 않는 학생");
		else			System.out.println("미술 : " + art);
	}
}

class OverloadingEx {
	public static void main(String[] args) {
		StudentInfo st1 = new StudentInfo(1234, 95, 85, 88);
		st1.showInfo();
		StudentInfo st2 = new StudentInfo(1235, 98, 88);
		st2.showInfo();
	}
}
