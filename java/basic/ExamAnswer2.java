class ExamAnswer2 {
	public static void main(String[] args) 	{
		int num = 8;
		// num�� ����ִ� ���ڰ��� �̿��Ͽ� ������ ������ �۾��� �����ϴ� switch�� �ۼ�
		// ������ �������� ���� 1���̸� ����, 2���̸� 2�ΰ���, 3��~6���� ��� ���� ������, 7�� �̻��� �밡�� ������ 
		switch (num)	{
			case  1 :
				System.out.println("����");		break;
			case  2 :
				System.out.println("2�ΰ���");		break;
			case  3 : case  4 : case  5 : case  6 : 
				System.out.println("��� ���� ������");		break;
			case  7 : case  8 : case  9 : case  10 : 
				System.out.println("�밡��������");		break;
	}
}
}