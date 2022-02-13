class FruitSeller {
	int numOfApple; 
	int myMoney; 
	int APPLE_PRICE; 
	// 일반 메소드에서는 멤버상수에 값을지정할 수 없으므로 APPLE_PRICE를 상수로 선언할 수 업승ㅁ
	// 일반 메소드는 다시 호출할 수 있으므로 상수의 값이 변경될까봐 오류를 발생시킴
	public void initMember(int num, int money, int price) {
	// 멤버 변수들을 초기화시키는 메소드 | ()안에 값이 초기화할 값들임
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
		System.out.println("보유 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
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
		System.out.println("사과 개수 : " + numOfApple);
		System.out.println("현재 잔액 : " + myMoney);
	}
}


class FruitSalesMain2 {
	public static void main(String[] args) 	{
		FruitSeller seller1 = new FruitSeller(); 
		// FruitSeller형 인스턴스 seller1을 선언 및 생성
		seller1.initMember(30, 0, 1500);
		// seller1 인스턴스 안의 initMember()메소드를 호출하여 멤버변수들을 초기화
		
		FruitSeller seller2 = new FruitSeller(); 
		seller2.initMember(20, 0, 1000);		

		FruitBuyer buyer = new FruitBuyer();	

		buyer.buyApple(seller1, 4500) ;
		buyer.buyApple(seller2, 2000) ;

		System.out.println("사과 판매자1 현황");
		seller1.showSaleResult();

		System.out.println("사과 판매자2 현황");
		seller2.showSaleResult();

		System.out.println("사과 구매자 현황");
		buyer.showBuyResult();
	}
}

