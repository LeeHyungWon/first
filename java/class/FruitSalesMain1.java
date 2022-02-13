/* ��� �Ǹ� �� ���� ���α׷�
��� �Ǹ��� : class FruitSeller
 - ������ �� �� (�������, ������) : ��� ��������, �������, �����
 - ������ �� ��� (�޼ҵ�) : �Ǹ�(), ����Ȳ����()

��� ������ : class FruitBuyer
 - ������ �� �� (��ٺ���, ������) : ��������� ��, ������ ���
 - ������ �� ��� (�޼ҵ�) : ����(), ����Ȳ����()

���α׷����� : class FuritSaleMain1
 - �Ǹ��ڿ� �������� �ν��Ͻ��� �����Ͽ� ��� �Ǹ� �� ���Ÿ� ��Ű�� ��Ȳ�� ��
*/
class FruitSeller {
	int numOfApple = 20; // ��������
	int myMoney = 0; // ����� - ���� ����� 1���� ���� ����
	final int APPLE_PRICE = 1000; // ������� - ��������� ������ ������ ����� �ű�
	public int saleApple(int money) { // <<-����� n�� �Ȱ� �ش��ϴ� ������� �����ڰ��� ����� �����ϴ� �޼ҵ�
		int num = money / APPLE_PRICE;  // �����ڰ� �� ��/������� = ����Ǹ� ����
		myMoney += money;				// �����ڰ� �� ����ŭ ����� ����
		numOfApple -= num;				// �Ǹ��� ���������ŭ �������� ����
		return num;						// �����ڿ��� ����� �ѱ�
	}
	public void showSaleResult() { // <<- �Ǹ� ��Ȳ ���� �޼ҵ�
		System.out.println("���� ��� : " + numOfApple);
		System.out.println("�Ǹ� ���� : " + myMoney);
	}
}

class FruitBuyer {
	int numOfApple = 0; // <<- ������ ��� ���� (���� ��� ���� ������)
	int myMoney = 10000; // �����ϰ� �ִ� �� 
	public void buyApple(FruitSeller seller, int money) {
	// ��� ���� �޼ҵ�(Ư�� �Ǹ���(FruitSeller�� �ν��Ͻ�)���� ���ž��� �ǳ� �� ����� ����)
		numOfApple +=  seller.saleApple(money); // ������� ����, �Ǹ��ڿ��� ��� ������ �ް�(��-money)�� ��
												// ����� ������ ���� �μ��� �Ͽ� seller�ν��Ͻ��� saleApple() �޼ҵ带 ȣ��
												// �Ǹ���(seller)���� "2000��(money)��ġ ��� �ּ���"
		myMoney -= money; // ���� �� (����� ������ �ݾ׸�ŭ �����ؼ� �����ݾ��� ������)
	}
	public void showBuyResult() { // <<- ���� ��Ȳ ���� �޼ҵ�
		System.out.println("��� ���� : " + numOfApple);
		System.out.println("���� �ܾ� : " + myMoney);
	}
}


class FruitSalesMain1 {
	public static void main(String[] args) 	{
		FruitSeller seller = new FruitSeller(); // ����Ǹ��� ��ü ����(���� line 13���� �̵�)
		// FruitSeller �� �ν��Ͻ� seller�� ���� �� ����
		FruitBuyer buyer = new FruitBuyer();	// ��������� ��ü ����(���� line 29�� �̵�)
		// FruitBuyer �� �ν��Ͻ� buyer ���� �� ����
		

		buyer.buyApple(seller, 2000) ;
		// buyer �ν��Ͻ� �ȿ� �ִ� buyApple() �޼ҵ� ȣ��
		// seller : ����� �����Ϸ��� �Ǹ��ڰ� �ʿ��ϹǷ� �Ǹ��� �ν��Ͻ��� seller�� ������
		// 2000 : ��� ������ ��
		System.out.println("��� �Ǹ��� ��Ȳ");
		seller.showSaleResult();

		System.out.println("��� ������ ��Ȳ");
		buyer.showBuyResult();
	}
}

/*
������
 - �Ǹ��ڳ� ������ �ν��Ͻ��� ���� �����ص� ��� ������ ��(�������)�� ������ ����

�ذ�å
 - �ν��Ͻ� ���� ��������� ���� �ٸ��� ������ �� �־�� ��
*/