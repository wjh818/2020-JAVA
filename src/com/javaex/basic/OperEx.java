package com.javaex.basic;

//������ ����
public class OperEx {

	public static void main(String[] args) {
		//arithOper();
		//incDecOper();
		logicalOper();
	}
	
	//��, �� ����
	public static void logicalOper() {
		//�񱳿����� >, >=, <, <=, ==(����), !=(���� �ʴ�)
		//�������� &&(����:AND), ||(����:OR), !(������:NOT)
		
		int n = 5;
		//n�� 0�ʰ�, 10�̸��ΰ�?
		//����1: n > 0 �̰�(AND)   ����2: n < 10
		boolean b1 = n > 0;
		boolean b2 = n < 10;
		boolean r = b1 && b2;
		
		System.out.println("n>0 and n<10 ? " + r);
		
		//n�� 0�����̰ų�, 10�̻��ΰ�?
		//����1: n <= 0 �̰ų�(OR)  ����2: n >= 10
		b1 = n <= 0;
		b2 = n >= 10;
		r = b1 || b2;
		
		System.out.println("n<=0 or n>=10 ? " + r);
		
		boolean notR = !r;
		System.out.println("������: " + notR);
	}
	
	//����, ���� ������
	public static void incDecOper() {
		//������ �߿�
		int a = 5; //a++(���߿� ����)
		int b = 5; //++a
		
		//����������
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		//����������
		System.out.println(b);
		System.out.println(++b);
		System.out.println(b);
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
		System.out.println("7 / 3 �Ǽ� => " + ((float)a / (float)b));
		
		//���� -> ������ 0���� ������
		//ArithmeticException
		//System.out.println("���� ������ 0 => " + (a / 0));
		
		//�Ǽ��� 0���� ������
		System.out.println("�Ǽ� / 0 => " + (4.0 / 0));
		//���Ѵ뿡 ������� -> ���Ѵ�
		System.out.println("���Ѵ��� ��� => " + (4.0 / 0 + 10));
		//���� -> ����� �� ���� ��(NaN -> Not a Number)
		System.out.println("0.0 . 0.0 => " + (0.0 / 0.0));
		//NaN ���Ե� ��� ���� -> NaN (���Ұ�)
		System.out.println("Nan ��� => " + (0.0 / 0.0 + 20));
		//���Ѽ����� Ȯ��
		System.out.println("���Ѽ��� Ȯ��: " + Double.isFinite(4.0 / 0));
		//NaN���� Ȯ��
		System.out.println("NaN Ȯ�� => " + Double.isNaN(0.0 / 0.0));
	}
}

