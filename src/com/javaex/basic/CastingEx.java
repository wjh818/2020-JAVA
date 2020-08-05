package com.javaex.basic;

//������ Ÿ���� �ٸ� ������ Ÿ������ ���� (Casting)
//1. ���� ǥ�� ���� ������ -> ���� ǥ�� ���� ������ (Promotion)
//2. ���� ǥ�� ���� ������ -> �κ� ǥ�� ���� ������ (Casting)
public class CastingEx {
	
	//�ڷ����� ũ��
	//byte(1) < short(2) < int(4) < long(8) << float(4) < double(8)
	public static void main(String[] args) {
//		promotionEx();
		castingEx();
	}
	
	
	public static void castingEx() {
		//explicit casting(����� ��ȯ)
		//ǥ�� ������ ���� Ÿ�� -> ���� Ÿ�������� ��ȯ
		//�ڷ��� ���� �߻� ����
		//�����ڰ� ��������� ��ȯ�� �ڷ����� ����
		float f = 1234.5678F;
		System.out.println("float: " + f);
		
		long l = (long)f;
		System.out.println("-> long: " + l);
		
		byte b = (byte)l;
		System.out.println("-> byte: " + b);
	}
	
	
	public static void promotionEx() {
		//implicit casting(�Ϲ��� ��ȯ)
		//ǥ�� ������ ���� Ÿ�� -> ���� Ÿ�������� ��ȯ
		byte b = 25; //1����Ʈ ������
		System.out.println("����Ʈ: " + b);
		
		short s = b; //2����Ʈ ������
		System.out.println("short: " + s);
		
		int i = s; //4����Ʈ ������
		System.out.println("int: " + i);
		
		long l = i; //8����Ʈ ������
		System.out.println("long: " + l);
		
		float f = l; //4����Ʈ �Ǽ���
		//����Ʈ ���� ������ ǥ�������� float�� long���� ����
		System.out.println("float: " + f);
		
		//double
	}

}
