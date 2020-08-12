package com.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
		Point P1 = new Point(); // 인스턴스화
		P1.setX(10);
		P1.setY(10);
		
		Point P2 = new Point();
		P2.setX(20);
		P2.setY(30);
		
		P1.draw();
		P2.draw();

	}

}
