import java.util.*;

class StudentInfo {
	String ID, name;
	int korean, history, math;
	double average;
	public StudentInfo (String ID, String name, int korean, int history, int math) {
		this.ID = ID;	this.name = name;	this.korean = korean;
		this.history = history;		this.math = math;
		average = ((korean + history + math) / 3.0);
	}
	public void showAllInfo() {
		System.out.println("학번 : " + ID);
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + korean);
		System.out.println("국사 : " + history);
		System.out.println("수학 : " + math);
		System.out.println("평균 : " + average);
	}
	public String getID() { return ID; }
}


class StudentHandler {
	private StudentInfo[] myStudents;
	private int numOfStudents;
	public StudentHandler(int num) {
		myStudents = new StudentInfo[num];
		numOfStudents = 0;
	}
	private void addStudentInfo(StudentInfo std) {
		myStudents[numOfStudents] = std;
		numOfStudents++;
	}
	public void addStudent(int choice) {
		String ID, name;
		int korean, history, math; 

		Scanner sc = new Scanner(System.in);
		System.out.print("학번 : ");		ID = sc.nextLine();
		System.out.print("이름 : ");		name = sc.nextLine();
		System.out.print("국어 : ");		korean = sc.nextInt();
		System.out.print("국사 : ");		history = sc.nextInt();
		System.out.print("수학 : ");		math = sc.nextInt();
		addStudentInfo(new StudentInfo (ID, name, korean, history, math));
		System.out.println("입력완료\n");
	}
	public void showAllInfo() {
		for (int i = 0 ; i < numOfStudents ; i++) {
			myStudents[i].showAllInfo();
			System.out.println();
		}
	}
	public void searchStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학번 : ");
		String keyword = sc.nextLine();		
		for (int i = 0 ; i < numOfStudents ; i++) {
			if (keyword.equals(myStudents[i].getID())) {
				myStudents[i].showAllInfo();
				return;
			}
		}
		System.out.println("검색결과가 없습니다.");
	}
}

class ScoreManagementSystem {
	public static void main(String[] args) {
		StudentHandler handler = new StudentHandler(10);

		while (true) {	
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 정보입력");
			System.out.println("2. 정보검색");
			System.out.println("3. 전체정보");
			System.out.println("4. 종료");
			System.out.print("메뉴 선택 >> ");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
				case 1: 
					handler.addStudent(choice);	break;
				case 2:
					handler.searchStudent();	break;
				case 3:
					handler.showAllInfo();		break;
				case 4:
					System.out.println("프로그램을 종료합니다.");
					return;
			}
		}
	}
}
