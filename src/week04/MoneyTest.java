package week04;

import java.util.Scanner;

class MoneyTest {
public static void main(String[] args)
	{	
	Scanner stdin = new Scanner(System.in);
	System.out.print("�ݾ��� �Է��Ͻÿ� : ");
	int amount = stdin.nextInt();
	int count;
	
	count = amount / 50000;
	int remainingAmount = amount % 50000;
	System.out.println("������ �� : " +'\t' +count + "��");
	
	count = remainingAmount / 10000;
	remainingAmount = remainingAmount % 10000;
	System.out.println("�ϸ��� �� : " + '\t' +count + "��");
	
	count = remainingAmount / 5000;
	remainingAmount = remainingAmount % 5000;
	System.out.println("��õ�� �� : " + '\t' +count + "��");
	
	count = remainingAmount / 1000;
	remainingAmount = remainingAmount % 1000;
	System.out.println("õ�� ��   : " +'\t' + count + "��");
	
	count = remainingAmount / 500;
	remainingAmount = remainingAmount % 500;
	System.out.println("����� ���� : " +'\t' + count + "��");
	
	count = remainingAmount / 100;
	remainingAmount = remainingAmount % 100;
	System.out.println("��� ���� : " + '\t' +count + "��");
	
	count = remainingAmount / 50;
	remainingAmount = remainingAmount % 50;
	System.out.println("���ʿ� ���� : " + '\t' +count + "��");
	
	count = remainingAmount / 10;
	remainingAmount = remainingAmount % 10;
	System.out.println("�ʿ� ���� : " + '\t' +count + "��");
	
	count = remainingAmount / 5;
	remainingAmount = remainingAmount % 5;
	System.out.println("���� ���� : " + '\t' +count + "��");
	
	System.out.println("�Ͽ� ���� : " + '\t' +remainingAmount + "��");
	stdin.close();
	}
		}
