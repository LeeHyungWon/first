class IfEx {
	public static void main(String[] args) 	{
		int num = 120;
		if (num <0) {
		// num�� ���� 0���� ������
			System.out.println("0 �̸�");
		} else {
		// num�� ���� 0���� ũ�ų� ������
			System.out.println("0 �̻�");
		
		// ������ if���� �⺻������ �ܺ� if���� ������ �����ϴ� ���׿��� ������
		if (num < 100) {
			System.out.println("0 �̻� 100�̸�");
		} else {
			System.out.println("100�̻�");
		}

		}
		// num������ ���� ����̸鼭 ¦�������� �˻��Ͽ� ����ϴ� if�� �ۼ�
		// ��°� : 120�� ����̸鼭 ¦��

		if ((num > 0) && (num % 2 == 0)) {
			System.out.println(num + " ����̸鼭 ¦�� ");
		} else {
			System.out.println(num + " �����̰ų� Ȧ�� "); // "�����̸鼭 Ȧ��"��� �߸��ϱ� ����
	}
	// socre�� ������ 70�̻��̸� c, 80�̻��̸� D, 90�̻��̸� A, 60�̻��̸� D, 60�̸��̸� F
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
	//Ȥ��
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
	// �̻��̳� �ʰ��� ��� ���� ������ ���ʴ�� �ϸ� ���ǿ� �������� �ʴ� ���� �Ⱦ�鼭 �������� ������ ����.
}
}