package com.javaex.basic;

//���� ���� ����
public class VarEx {
	public static void main(String[] args) {
		//���� �ĺ���
		//����, ����, $, _ �� ����
		//�ٸ�, ���ڷ� �����ϸ� �ȵ�
		
		/*
		 * ������ ����
		 * -�������� �ҹ��ڷ� �ۼ�
		 * -�ܾ��� ������ ��� �� ��° �ܾ�� �빮�ڷ� ����
		 */
		//����
		int myAge; //myAge��� �̸��� int(4byte) ���� ������ �����
		//�ʱ�ȭ
		myAge = 29;
		
		int myAge2 = 29; //����� �ʱ�ȭ�� ���ÿ� �� �� �ִ�(��õ)
		
		//������ ��� ����� ������ ������ Ÿ�� �̿��� �����ʹ� ���� �� ����
//		myAge = 12345678901234567890; //Error
		
		//��ȸ�� ����
		System.out.println("myAge�� ����:" + myAge);
		myAge = myAge + 1;
		System.out.println("����� myAge�� ����" + myAge);
	}
}
