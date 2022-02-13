class Aa {
	public void testA() { System.out.println("Aa's test"); }
	public void rideMethod() { System.out.println("Aa's method"); }
	public void loadMethod() { System.out.println("void method"); }
}

class Bb extends Aa {
	public void testB() { System.out.println("Bb's test"); }
	public void rideMethod() { System.out.println("Bb's method"); }				// �������̵�
	public void loadMethod(int n) { System.out.println("int method"); }			// �����ε�
}

class Cc extends Bb {
	public void testC() { System.out.println("Cc's test"); }
	public void rideMethod() { System.out.println("Cc's method"); }				// �������̵�
	public void loadMethod(double n) { System.out.println("double method"); }	// �����ε�
}

class RideAndLoad {
	public static void main(String[] args) {
		Aa ref1 = new Cc();		Bb ref2 = new Cc();		Cc ref3 = new Cc();
		// ����Ŭ������ ������ �� ����Ŭ������ �ν��Ͻ��� ������ �� ����
		// JVM���� ���� �ν��Ͻ��� �ڷ����� ����Ŭ������ �ƴ� ������ ����Ŭ�������ڷ������� �ν��Ͽ� ����Ŭ������ �޼ҵ�鸸 ��밡��
		// ��, �������̵��� �޼ҵ忡 ���ؼ��� ����Ŭ������ �޼ҵ尡 �����

		/*
		ref1.testA() : ���డ��
		ref1.testB()�� ref1.testC() : ����Ұ� - ref1�� AaŬ���������� JVM�� �νĵǹǷ� AaŬ������ �޼ҵ�鸸 ���డ��

		ref2.testA()�� ref2.testB() : ���డ�� - ref2�� BbŬ�������̹Ƿ� ��ӹ��� AaŬ������ �޼ҵ�鵵 ���డ��
		ref2.testC() : ����Ұ� - ref2�� BbŬ���������� JVM�� �νĵǹǷ� AaŬ������ BbŬ������ �޼ҵ�鸸 ���డ��

		ref3 �ν��Ͻ��δ� testA(), testB(), testC() ��� ���డ��
		*/

		ref1.rideMethod();		ref2.rideMethod();		ref3.rideMethod();
		// Cc's method			Cc's method				Cc's method
		// ����Ŭ������ �����ϰ� ����Ŭ������ ������ �ν��Ͻ��δ� ����Ŭ������ �޼ҵ忡�� ������ �����ϳ� 
		// �������̵��� �޼ҵ忡�� ���������� ������Ŭ������ �������̵��� �޼ҵ尡 �����

		ref3.loadMethod();		ref3.loadMethod(1);		ref3.loadMethod(3.14);
		// void method			int method				double method
		// ������Ŭ������ �ν��Ͻ������� ����Ŭ�������� �����Ͽ� �̸��� ���� �����ε��� �޼ҵ���� ����� �� ����
	}
}
