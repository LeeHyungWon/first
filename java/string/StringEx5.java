class StringEx5 {
	public static void main(String[] args) {
		// 1 ~ 1000 ������ ������ 8�� ����ִ� ������ ������ ���
		int count = 0;
		for (int i = 1 ; i <= 1000 ; i++) {
			String tmp = i + "";	// ���� i�� ���ڿ� �ν��Ͻ��� ����
			if (tmp.indexOf('8') >= 0)	count++;
			// tmp���ڿ��ȿ� '8'�� ������ count���� 1����
		}
		System.out.println("8�� ����ִ� ������ ���� : " + count);

		// 1 ~ 1000 ������ ������ 8�� �� ������?
		count = 0;
		for (int i = 1 ; i <= 1000 ; i++) {
			String tmp = i + "";	// ���� i�� ���ڿ� �ν��Ͻ��� ����
			for (int j = 0 ; j < tmp.length() ; j++) {
			// 0�� ���� ���ڿ��� ������ �ε������� ������ ��
				if (tmp.charAt(j) == '8')	count++;
			}
		}
		System.out.println("8�� �� ���� : " + count);
	}
}
