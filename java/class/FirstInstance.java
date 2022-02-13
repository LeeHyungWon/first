class NumberEx {
	int num = 0;	// ��������� NumerEx Ŭ���� ������ �����Ӱ� ��밡��
	public void addNum(int n) {
		num += n;
	}
	public int getNumber() {
		return num;
	}
}

class FirstInstance {
	public static void main(String[] args) 	{
	NumberEx nInst;			// NumerEx�� �ν��Ͻ� nInst�� ���� (�޸𸮿� ������ ���� �ʰ� �ּҸ� ��ϵ� ����)
	nInst = new NumberEx();	// NumberEx�� �ν��Ͻ��� nInst�� ���� �� ���� (����� ��ϵ� �޸� �ּҿ� ���� ������ �־� ������ ����)
	System.out.println("�޼ҵ� ȣ�� �� : " + nInst.getNumber()); // 0
	// nInst.getNumber() : nInst �ν��Ͻ� �ȿ� �ִ� getNumber() �޼ҵ带 ȣ���϶�� ����

	nInst.addNum(10);
	// nInst.addNumber() : nInst �ν��Ͻ� �ȿ� �ִ� addNumber(10) �޼ҵ带 10�� ������ ȣ���϶�� ����
	System.out.println("�޼ҵ� ȣ�� �� : " + nInst.getNumber()); // 10

	NumberEx nInst2 = new NumberEx();
	nInst2.addNum(100);
	System.out.println("nInst2 : " + nInst2.getNumber()); // 100

	numMethod(nInst);	// �Ű������� �ν��Ͻ��� ������ �� ����
	// �޼ҵ��� �μ��� �ν��Ͻ��� ������ ��� �ν��Ͻ��� ���� �ش��ϴ� �ּҰ��� �����ؼ� ������
	// �ּҸ� �������� ������ �� �ּҿ� �ش��ϴ� �ν��Ͻ��� ������ �����ϰ� ��(������ �����)
	System.out.println("�޼ҵ� ȣ�� ��2 : " + nInst.getNumber()); // 22

	int test = 10;
	numMethod2(test);
	// �޼ҵ忡�� ����� �μ��� ����(�⺻ �ڷ���)�� ������ ��� ������ ������ �����ؼ� ������(������ ���� �ȵ�)
	System.out.println("test : " + test); //	10
	}
	public static void numMethod(NumberEx num) {
		num.addNum(12);
	}
	public static void numMethod2(int num) {
		num += 12;
	} 
}