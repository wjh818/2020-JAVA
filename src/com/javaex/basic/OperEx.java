package com.javaex.basic;

//������ ����
public class OperEx {

	public static void main(String[] args) {
		arithOper();
	}

	//���������
	public static void arithOper() {
		//��Ģ����: +, -, *, /
		int a = 7;
		int b = 3;
		
		System.out.println("7 / 3 => " + (7 / 3));
		// int / int -> int(��)
		System.out.println("7 / 3�� ������ => " + (7 % 3));
		// ������ ������: %
		
		//��Ȯ�� �Ǽ����� �������� int -> float ��ȯ
		System.out.println("7 / 3 �Ǽ�=> " + ((float)a / (float)b));
		float result = a / b;
	}
}

