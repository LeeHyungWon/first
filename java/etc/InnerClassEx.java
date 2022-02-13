class OuterClass {
	private String myName;
	private int num;
	OuterClass(String name) {
		myName = name;
		num = 0;
	}
	public void whoAreYou() {
		num++;
		System.out.println(myName + " Outer Class " + num);
	}
	class InnerClass {
		InnerClass() { whoAreYou(); }
		// inner Ŭ���������� outer Ŭ������ ����� ���� ���� �� �� ����
	}
}

class InnerClassEx {
	public static void main(String[] args) {
		OuterClass out1 = new OuterClass("1st");
		OuterClass out2 = new OuterClass("2nd");
		out1.whoAreYou();	out2.whoAreYou();

		OuterClass.InnerClass inn1 = out1.new InnerClass();	// 1st Outer Class 2
		OuterClass.InnerClass inn2 = out2.new InnerClass();	// 2nd Outer Class 2
		OuterClass.InnerClass inn3 = out1.new InnerClass();	// 1st Outer Class 3
		OuterClass.InnerClass inn4 = out1.new InnerClass();	// 1st Outer Class 4
		OuterClass.InnerClass inn5 = out2.new InnerClass();	// 2nd Outer Class 3
		// inner Ŭ������ �ν��Ͻ��� �����Ϸ��� �ݵ�� outer Ŭ������ �ν��Ͻ��� �̿��ؾ� ��
		// inner Ŭ������ �ν��Ͻ����� outer Ŭ������ �ν��Ͻ� �ȿ� �����ϰ� ��
	}
}
