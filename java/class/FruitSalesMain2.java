class FruitSeller {
	int numOfApple; 
	int myMoney; 
	int APPLE_PRICE; 
	// �Ϲ� �޼ҵ忡���� �������� ���������� �� �����Ƿ� APPLE_PRICE�� ����� ������ �� ���¤�
	// �Ϲ� �޼ҵ�� �ٽ� ȣ���� �� �����Ƿ� ����� ���� ����ɱ�� ������ �߻���Ŵ
	public void initMember(int num, int money, int price) {
	// ��� �������� �ʱ�ȭ��Ű�� �޼ҵ� | ()�ȿ� ���� �ʱ�ȭ�� ������
		numOfApple = num;
		myMoney = money;
		APPLE_PRICE = price;
	}
	public int saleApple(int money) { 
		int num = money / APPLE_PRICE; 
		myMoney += money;				
		numOfApple -= num;				
		return num;						
	}
	public void showSaleResult() { 
		System.out.println("���� ��� : " + numOfApple);
		System.out.println("�Ǹ� ���� : " + myMoney);
	}
}

class FruitBuyer {
	int numOfApple = 0; 
	int myMoney = 10000; 
	public void buyApple(FruitSeller seller, int money) {
		numOfApple +=  seller.saleApple(money); 
												
												
		myMoney -= money; 
	}
	public void showBuyResult() { 
		System.out.println("��� ���� : " + numOfApple);
		System.out.println("���� �ܾ� : " + myMoney);
	}
}


class FruitSalesMain2 {
	public static void main(String[] args) 	{
		FruitSeller seller1 = new FruitSeller(); 
		// FruitSeller�� �ν��Ͻ� seller1�� ���� �� ����
		seller1.initMember(30, 0, 1500);
		// seller1 �ν��Ͻ� ���� initMember()�޼ҵ带 ȣ���Ͽ� ����������� �ʱ�ȭ
		
		FruitSeller seller2 = new FruitSeller(); 
		seller2.initMember(20, 0, 1000);		

		FruitBuyer buyer = new FruitBuyer();	

		buyer.buyApple(seller1, 4500) ;
		buyer.buyApple(seller2, 2000) ;

		System.out.println("��� �Ǹ���1 ��Ȳ");
		seller1.showSaleResult();

		System.out.println("��� �Ǹ���2 ��Ȳ");
		seller2.showSaleResult();

		System.out.println("��� ������ ��Ȳ");
		buyer.showBuyResult();
	}
}

