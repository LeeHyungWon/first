/*
FirstJava.java 실행순서
E:							// 사용하여 E드라이브 이동
E:\cd hwl\java\basic		// .java 파일이 있는 곳으로 이동	
E:\cd hwl\java\basic>javac FirstJava.java // FirstJava.java를 컴파일해서 FirstJava.class파일 생성
E:\cd hwl\java\basic>java FirstJava // 컴파일하여 생성한 클래스 파일을 이용하여 실행시킴
*/

class FirstJava {
	public static void main(String[] args) {
		System.out.println("Java를 자바라!");
		System.out.println("2 + 5 = " + 2 + 5);		// 2 + 5 = 25
		System.out.println("2 + 5 = " + (2 + 5));		// 2 + 5 = 7
		System.out.println(2 + 5 + " = 2 + 5 ");		// 7 = 2 + 5
		System.out.println(2 + " 2 + 5 " + 5);		// 2 2 + 5 5
	}
}
