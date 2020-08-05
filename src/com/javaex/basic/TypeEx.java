package com.javaex.basic;

//�ڹ��� �⺻ �ڷ��� ����
public class TypeEx {

	public static void main(String[] args) {
//		intLongTest();
//		floatDoubleTest();
//		booleanEx();
		charEx();
	}

	//char�� ����
	public static void charEx() {
		//2����Ʈ(��ȣ����)
		//�����ڵ� �� ������ ��ġȭ�� �ڵ�
		//''�� ��������� <- char
		//"" <- String
		char ch1 = 'A';
		char ch2 = '��';
		
		System.out.println("A -> " + ch1);
		System.out.println("�� -> " + ch2);
		
		System.out.println(ch1 + ch2);
		
	}
	
	
	//boolean ����
	public static void booleanEx() {
		//���� true or false
		//�񱳿���, �������� ����� ��ȯ
		//�帧����, �ݺ����� �帧�� ������ �� �� ���� ����Ѵ�
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		int v1 = 3;
		int v2 = 5;
		
		boolean result = v1 < v2;
		//�񱳿���, �������� ����� ��ȯ
		System.out.println("v1 < v2 ? " + result);
	}
	
	//�Ǽ��� ����
	//float (4) < double(8)
	public static void floatDoubleTest() {
		//���е� ����, ��� ǥ�� ������ ���� �ڷ���
		float fVar = 3.14159F; //float�� �������� F
		double dVar = 3.14159;
		
		//���е� �ľ�
		fVar = 0.1234567890123456789F;
		dVar = 0.1234567890123456789;
		
		System.out.println("float:" + fVar);
		System.out.println("double:" + dVar);
		
		//���� ǥ���
		fVar = 1234567890E-10F;
		System.out.println(fVar);
		
		//�Ǽ� �ڷ����� ó���� ���е��� ��������(ǥ�� ������ ����)
		System.out.println(0.1 * 3);
		//������ ���� ���е��� �䱸�ϴ� ���߿��� float, double ��� �����ؾ� ��
	}
	//������ ����
	//byte < short < int < long
	public static void intLongTest() {
		//���� ����
		//int -> �ڹٰ� �ٷ�� �������� ���� �⺻���� ����
		int intVar1;
		intVar1 = 2020; //�ʱ�ȭ �۾�
		int intVar2 = 2020; //���� + �ʱ�ȭ �۾�
		
		System.out.println(intVar1);
		System.out.println(intVar2);
		
		//long : 8byte
		long longVar1;
		longVar1 = 2020;
		long longVar2 = 123456789012345678L; //�� �ڿ� L �ٿ��ֱ�
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		//2����, 8����, 16����
		int bin = 0b1100; //2���� 0b�� ����
		int oct = 010; //8������ 0���� ����
		int hex = 0xFF; //16������ 0x�� ����

		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
}
