class SwitchEx {
	public static void main(String[] args) 	{
		int num = 2;
		switch(num) {
			case 1 :
				System.out.println("num������ ���� 1");		break;
			case 2 :
				System.out.println("num������ ���� 2"); 	break;
			case 3 :
				System.out.println("num������ ���� 3");		break;
			case 4 :
				System.out.println("num������ ���� ����");
	}
	// ���� : num�� ���� 1, 2, 3�̸� "��" 4, 5, 6 �̸� "��" 7, 8, 9�� "��"��� ���
		switch(num) {
			case 1 : case 2 : case 3 :
				System.out.println("��");		break;
			case 4 : case 5 : case 6 :
				System.out.println("��");		break;
			case 7 : case 8 : case 9 :	
				System.out.println("��");		break;
}
	// jdk 1.7���� ���ڿ��� ������.
	switch ("bb")	{
	case "ab" :
		System.out.println("���� ab") ; break;
	case "bb" :
		System.out.println("���� bb") ; break;
	case "cb" :
		System.out.println("���� bb") ; break;
	}
}
}