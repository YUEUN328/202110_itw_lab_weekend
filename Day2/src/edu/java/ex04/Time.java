package edu.java.ex04;

public class Time {
	int hour;
	int minute;
	double second;
	
	// 생성자 오버로딩(overloading)
	public Time() {}
	
	public Time(int hour, int minute, double second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
}
