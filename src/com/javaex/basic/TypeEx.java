package com.javaex.basic;

//자바의 기본 자료형 연습
public class TypeEx {

	public static void main(String[] args) {
//		intLongTest();
//		floatDoubleTest();
//		booleanEx();
		charEx();
	}

	//char형 연습
	public static void charEx() {
		//2바이트(부호없음)
		//유니코드 한 글자의 수치화된 코드
		//''로 묶어줘야함 <- char
		//"" <- String
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println("A -> " + ch1);
		System.out.println("한 -> " + ch2);
		
		System.out.println(ch1 + ch2);
		
	}
	
	
	//boolean 연습
	public static void booleanEx() {
		//논리값 true or false
		//비교연산, 논리연산의 결과를 반환
		//흐름제어, 반복에서 흐름을 제어할 때 이 값을 사용한다
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		int v1 = 3;
		int v2 = 5;
		
		boolean result = v1 < v2;
		//비교연산, 논리연산의 결과로 반환
		System.out.println("v1 < v2 ? " + result);
	}
	
	//실수형 연습
	//float (4) < double(8)
	public static void floatDoubleTest() {
		//정밀도 포기, 대신 표현 범위를 넓힌 자료형
		float fVar = 3.14159F; //float는 마지막에 F
		double dVar = 3.14159;
		
		//정밀도 파악
		fVar = 0.1234567890123456789F;
		dVar = 0.1234567890123456789;
		
		System.out.println("float:" + fVar);
		System.out.println("double:" + dVar);
		
		//지수 표기법
		fVar = 1234567890E-10F;
		System.out.println(fVar);
		
		//실수 자료형의 처리는 정밀도가 떨어진다(표현 범위를 넓힘)
		System.out.println(0.1 * 3);
		//금융권 같이 정밀도를 요구하는 개발에는 float, double 사용 유의해야 함
	}
	//정수형 연습
	//byte < short < int < long
	public static void intLongTest() {
		//변수 선언
		//int -> 자바가 다루는 정수형의 가장 기본적인 형태
		int intVar1;
		intVar1 = 2020; //초기화 작업
		int intVar2 = 2020; //선언 + 초기화 작업
		
		System.out.println(intVar1);
		System.out.println(intVar2);
		
		//long : 8byte
		long longVar1;
		longVar1 = 2020;
		long longVar2 = 123456789012345678L; //맨 뒤에 L 붙여주기
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		//2진수, 8진수, 16진수
		int bin = 0b1100; //2진수 0b로 시작
		int oct = 010; //8진수는 0으로 시작
		int hex = 0xFF; //16진수는 0x로 시작

		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
}
