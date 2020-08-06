package com.javaex.basic;

import java.util.Scanner;

public class ConsoleEx {

	public static void main(String[] args) {
		//consoleOutput();
		consoleInput();
	}
	
	//�ܼ� �Է�(System.in)
	//Scanner Ŭ������ �̿��ϸ� �پ��� �Է� �ҽ��κ��� ������ �Է� ���� �� �ִ�
	public static void consoleInput() {
		//Tip1. Ctrl + Shift + O -> �ڵ� import 
		//Tip2. Ctrl + Space -> Code Assist
		Scanner scanner = new Scanner(System.in);
		//�̸���? -> ���ڿ� ������ �Է�
		//���̴�? �̶�� ���� ���� ������ �Է�
		//��� -> �̸�, ���̴� OO��
		System.out.print("�̸���? ");
		String name = scanner.next();
		System.out.print("���̴�? ");
		int age = scanner.nextInt();
		
		System.out.println("�̸��� " + name + ", ���̴� " + age);
		//�ý��� �ڿ��� ����ϴ� ����� �̿��� �Ŀ��� �ݵ�� �ݾ����� ***�߿�***
		scanner.close();
	}
	
	//�ܼ� ���
	public static void consoleOutput() {
		//System.out.print -> ��� �� ���� ����
		//System.out.println -> ��� �� ����
		//System.out.printf -> ����ȭ�� ���: String�� �� ����
		System.out.print("Hello ");
		System.out.println("Java");
		
		//�̽������� ����(������)
		// \n: ����
		// \t: ��
		// \": �ֵ���ǥ
		// \\: \
		System.out.println("Hello\nJava");
		System.out.println("Hello\tJava");
		String message = "Hello, \"Java\""; //�ֵ���ǥ
		
		//������ �ٷ�� �ϴµ� C:\mydir\myfile.txt
		String dir = "C:\\mydir\\myfile.txt"; // //->/ : ��������
		System.out.println(dir);
		
	}
}
