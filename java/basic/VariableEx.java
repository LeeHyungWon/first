class VariableEx {
	public static void main(String[] args) 	{
		int num1 = 10; //int�� ���� num1�� ���� �� ������ �� 10�� ����
		int num2 = 20, num3 = num1 + num2; // ���� �ڷ����� ������ ��� �� �� �̻��� ���ÿ� ���� �� ������ �� ������ , �ʱ�ȭ�� ����
		System.out.println("num1 : " + num1 + ", num2 : " + num2 + ", num3 : " + num3);
		// num1 : 10, num2 : 20, num3 : 30

		char c1 = 'a'; // char���̹Ƿ� ���� ����ǥ�� ���ڸ� ��� ����
		char c2 = 65; // char�� ������ ������ ����Ǹ� ����� ������ �ش��ϴ� �����ڵ� ���ڷ� ��ȯ�� (�����ڵ� 65: A / 98: a ���)
		System.out.println("c1 : " + c1 + ", c2 : " + c2); // c1 : a, c2 : A 

		long num4 = 10000000000L; 
		// ������ ���ͷ� ���� ���� int�� ������ ����� ��� ���̻�� ��(L)�� �ٿ��� long���̶�� ǥ�ø� ��
		// ���̻翡 ���� ������ ���� ��ҹ��� ������ ������ ���� ���� 1�� �����ϱ� ���Ͽ� �빮�ڸ� �����
		System.out.println("num4 : " + num4);

		double d1 = 3.14;
		System.out.println("d1 : " + d1);

		float f1 = 3.14F;
		// �Ǽ��� �⺻ �ڷ����� double(8byte)�̹Ƿ� �Ǽ��� ���ͷ����� float(4byte)�� �������� ���̻� ����(F)�� �ٿ��� ��
		System.out.println("f1 : " + f1);
	}
}