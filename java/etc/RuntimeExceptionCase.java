class RuntimeExceptionCase {
	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			arr[-1] = 20;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		try {
			Object obj = new int[10];
			String str = (String)obj;
		} catch (ClassCastException e) {
		// ����ȯ�� �Ұ����� ��ü�� ����ȯ ��ų �� �߻��ϴ� ����
			System.out.println(e.getMessage());
		}
		try {
			int[] arr = new int[-10];
		} catch (NegativeArraySizeException e) {
		// �迭�� ũ�⸦ ������ �Է����� ��� �߻��ϴ� ����
			System.out.println(e.getMessage());
		}
		try {
			String str = null;
			int len = str.length();
		} catch (NullPointerException e) {
		// ��ü�� ����ִ��� �𸣰� ��ü�� ����ϰ��� �� �� �߻��ϴ� ����
			System.out.println(e.getMessage());
		}
	}
}
