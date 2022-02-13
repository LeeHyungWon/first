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
		System.out.println("�й� : " + ID);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + korean);
		System.out.println("���� : " + history);
		System.out.println("���� : " + math);
		System.out.println("��� : " + average);
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
		System.out.print("�й� : ");		ID = sc.nextLine();
		System.out.print("�̸� : ");		name = sc.nextLine();
		System.out.print("���� : ");		korean = sc.nextInt();
		System.out.print("���� : ");		history = sc.nextInt();
		System.out.print("���� : ");		math = sc.nextInt();
		addStudentInfo(new StudentInfo (ID, name, korean, history, math));
		System.out.println("�Է¿Ϸ�\n");
	}
	public void showAllInfo() {
		for (int i = 0 ; i < numOfStudents ; i++) {
			myStudents[i].showAllInfo();
			System.out.println();
		}
	}
	public void searchStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �й� : ");
		String keyword = sc.nextLine();		
		for (int i = 0 ; i < numOfStudents ; i++) {
			if (keyword.equals(myStudents[i].getID())) {
				myStudents[i].showAllInfo();
				return;
			}
		}
		System.out.println("�˻������ �����ϴ�.");
	}
}

class ScoreManagementSystem {
	public static void main(String[] args) {
		StudentHandler handler = new StudentHandler(10);

		while (true) {	
			System.out.println("*** �޴� ���� ***");
			System.out.println("1. �����Է�");
			System.out.println("2. �����˻�");
			System.out.println("3. ��ü����");
			System.out.println("4. ����");
			System.out.print("�޴� ���� >> ");

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
					System.out.println("���α׷��� �����մϴ�.");
					return;
			}
		}
	}
}
