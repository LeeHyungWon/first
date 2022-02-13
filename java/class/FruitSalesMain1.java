/* 사과 판매 및 구매 프로그램
사과 판매자 : class FruitSeller
 - 가져야 할 값 (멤버변수, 멤버상수) : 사과 보유개수, 사과가격, 매출액
 - 가져야 할 기능 (메소드) : 판매(), 현상황보기()

사과 구매자 : class FruitBuyer
 - 가져야 할 값 (멤바변수, 멤버상수) : 사과구매할 돈, 구매한 사과
 - 가져야 할 기능 (메소드) : 구매(), 현상황보기()

프로그램제어 : class FuritSaleMain1
 - 판매자와 구매자의 인스턴스를 생성하여 사과 판매 및 구매를 시키고 상황을 봄
*/
class FruitSeller {
	int numOfApple = 20; // 보유개수
	int myMoney = 0; // 매출액 - 아직 사과를 1개도 안판 상태
	final int APPLE_PRICE = 1000; // 사과가격 - 사과가격은 변하지 않으니 상수로 매김
	public int saleApple(int money) { // <<-사과를 n개 팔고 해당하는 사과값을 구매자가에 사과를 리턴하는 메소드
		int num = money / APPLE_PRICE;  // 구매자가 낸 돈/사과가격 = 사과판매 갯수
		myMoney += money;				// 구매자가 낸 돈만큼 매출액 증가
		numOfApple -= num;				// 판매한 사과갯수만큼 보유개수 감소
		return num;						// 구매자에게 사과를 넘김
	}
	public void showSaleResult() { // <<- 판매 현황 보기 메소드
		System.out.println("보유 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}
}

class FruitBuyer {
	int numOfApple = 0; // <<- 구매한 사과 개수 (아직 사과 구매 안했음)
	int myMoney = 10000; // 보유하고 있는 돈 
	public void buyApple(FruitSeller seller, int money) {
	// 사과 구매 메소드(특정 판매자(FruitSeller형 인스턴스)에게 구매액을 건넨 후 사과를 받음)
		numOfApple +=  seller.saleApple(money); // 사과개수 누적, 판매자에게 사과 갯수를 받고(돈-money)을 냄
												// 사과를 구매할 돈을 인수로 하여 seller인스턴스의 saleApple() 메소드를 호출
												// 판매자(seller)에게 "2000원(money)어치 사과 주세요"
		myMoney -= money; // 돈을 냄 (사과를 구매한 금액만큼 누적해서 보유금액이 감소함)
	}
	public void showBuyResult() { // <<- 구매 현황 보기 메소드
		System.out.println("사과 개수 : " + numOfApple);
		System.out.println("현재 잔액 : " + myMoney);
	}
}


class FruitSalesMain1 {
	public static void main(String[] args) 	{
		FruitSeller seller = new FruitSeller(); // 사과판매자 객체 생성(이후 line 13으로 이동)
		// FruitSeller 형 인스턴스 seller를 선언 및 생성
		FruitBuyer buyer = new FruitBuyer();	// 사과구매자 객체 생성(이후 line 29로 이동)
		// FruitBuyer 형 인스턴스 buyer 선언 및 생성
		

		buyer.buyApple(seller, 2000) ;
		// buyer 인스턴스 안에 있는 buyApple() 메소드 호출
		// seller : 사과를 구매하려면 판매자가 필요하므로 판매자 인스턴스인 seller를 가져감
		// 2000 : 사과 구매할 돈
		System.out.println("사과 판매자 현황");
		seller.showSaleResult();

		System.out.println("사과 구매자 현황");
		buyer.showBuyResult();
	}
}

/*
문제점
 - 판매자나 구매자 인스턴스를 여럿 생성해도 모두 동일한 값(멤버변수)을 가지고 있음

해결책
 - 인스턴스 별로 멤버변수의 값을 다르게 지정할 수 있어야 함
*/