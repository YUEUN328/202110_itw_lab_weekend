package edu.java.ex04;

// java.lang 패키지의 클래스 이름들은 import 없이 사용 가능
// 같은 패키지의 클래스 이름들은 import 없이 사용 가능

public class ExMain {
	
	public static void main(String[] args) {
		// 클래스(class): 객체가 가져야 되는 속성(데이터)과 기능을 정의한 데이터 타입
		// 속성: 멤버 변수(member variable), 필드(field), 프로퍼티(property)
		// 기능: 메서드(method)
		String s1 = "Hello, Java!";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());

		String s2 = "Good Afternoon!";
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		int hour = 14;
		int minute = 18;
		double second = 31.5;
		
		int hour2 = 14;
		int minute2 = 19;
		double second2 = 30.0;
		
		Time t1 = new Time();
		System.out.println(t1); // 기본 생성자(default constructor)
		System.out.println(t1.hour);
		System.out.println(t1.minute);
		System.out.println(t1.second);
		
		Time t2 = new Time(14, 49, 30.0); // 파라미터를 갖는 생성자
		System.out.printf("%d:%d:%.3f", t2.hour, t2.minute, t2.second);	
		
		Time t3 = new Time(3, 6, 0.0);
		System.out.printf("%02d:%2d:%6.3f\n", t3.hour, t3.minute, t3.second);
		// %d: digit(10진수), %f: floating-point(실수), %s: string(문자열)
	}

}
