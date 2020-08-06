package com.javaex.basic;

//������ ����
public class OperEx {

	public static void main(String[] args) {
		//arithOper();
		//incDecOper();
		//logicalOper();
		//bitOper();
		conditionalOper();
	}
	
	//3�� ������
	public static void conditionalOper() {
		//���� ? ���϶� : �����϶�
		//������ ���� ����, �ڵ� �������� ���� �� �ִ�
		int a = 10;
		//a�� ¦���� "¦��", �ƴϸ� "Ȧ��" ���ڿ�
		String message = a % 2 == 0 ? "¦��" : "Ȧ��";
		System.out.println("a�� ¦���Դϱ�? " + message);
		
		int score = 85;
		//������ 80�� �̻��̸� Good, 50�� �̻��̸� Pass, �׷��� ������ Fail
		message = score >= 80 ? "Good" : score >= 50 ? "Pass" : "Fail";
		System.out.println("���� ���: " + message);
	}
	
	//��Ʈ ������
	public static void bitOper() {
		//and(&), or(|), not(~)
		//������ �����͸� ��Ʈ ������ �����ϴ� ������
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		int result = b1 & b2; //bit and ����
		System.out.println(Integer.toBinaryString(result));
		
		result = b1 | b2; //bit or ����
		System.out.println(Integer.toBinaryString(result));
		
		result = ~b1; //bit not ���� (0 <-> 1)
		System.out.println(Integer.toBinaryString(result));
		System.out.println(result);
		
		//��Ʈ ����Ʈ
		//		<< : ��Ʈ�� �������� �̵� (������ 2�� ����� ��)
		//		>> : ��Ʈ�� ���������� �̵� (������ 2�� ����� ������)
		
		int val = 1;
		System.out.println(val);
		//�������� 1��Ʈ �̵�
		System.out.println(Integer.toBinaryString(val << 1));
		
		val = 0b100;
		//���������� 2��Ʈ �̵�
		System.out.println(Integer.toBinaryString(val >> 2));
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
		
		// !(������) : ������ �����´� (true <-> false)
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

