package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		Point P1 = new Point(); // 기본생성자 사용
		P1.setX(10);
		P1.setY(10);
		
		Point P2 = new Point(20, 30); // 사용자 생성자 사용
		
		P1.draw();
		P2.draw();
		
		// 오버로딩된 메서드의 활용
		P1.draw(false);
		P2.draw(false);

	}

}
