class Aa {
	public void test1() { System.out.println("Aa's test1()"); }
	public void test2() { System.out.println("Aa's test2()"); }
}

class Bb extends Aa {
	public void test1() { System.out.println("Bb's test1()"); }
	public void test2() { System.out.println("Bb's test2()"); }
}

class Cc extends Bb {
	public void test2() { System.out.println("Cc's test2()"); }
}

class OverrridingTest {
	public static void main(String[] args) {
		Bb b = new Bb();	Cc c = new Cc();

		b.test1();			b.test2();		c.test1();		c.test2();
		// Bb's test1()		Bb's test2()	Bb's test1()	Cc's test2()
		// 인스턴스를 기준으로 하여 최하위 클래스에서 오버라이딩된 메소드가 호출됨
	}
}
