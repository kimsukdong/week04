package week04;

import java.util.Scanner;

class MoneyTest {
public static void main(String[] args)
	{	
	Scanner stdin = new Scanner(System.in);
	System.out.print("금액을 입력하시오 : ");
	int amount = stdin.nextInt();
	int count;
	
	count = amount / 50000;
	int remainingAmount = amount % 50000;
	System.out.println("오만원 권 : " +'\t' +count + "장");
	
	count = remainingAmount / 10000;
	remainingAmount = remainingAmount % 10000;
	System.out.println("일만원 권 : " + '\t' +count + "장");
	
	count = remainingAmount / 5000;
	remainingAmount = remainingAmount % 5000;
	System.out.println("오천원 권 : " + '\t' +count + "장");
	
	count = remainingAmount / 1000;
	remainingAmount = remainingAmount % 1000;
	System.out.println("천원 권   : " +'\t' + count + "장");
	
	count = remainingAmount / 500;
	remainingAmount = remainingAmount % 500;
	System.out.println("오백원 동전 : " +'\t' + count + "개");
	
	count = remainingAmount / 100;
	remainingAmount = remainingAmount % 100;
	System.out.println("백원 동전 : " + '\t' +count + "개");
	
	count = remainingAmount / 50;
	remainingAmount = remainingAmount % 50;
	System.out.println("오십원 동전 : " + '\t' +count + "개");
	
	count = remainingAmount / 10;
	remainingAmount = remainingAmount % 10;
	System.out.println("십원 동전 : " + '\t' +count + "개");
	
	count = remainingAmount / 5;
	remainingAmount = remainingAmount % 5;
	System.out.println("오원 동전 : " + '\t' +count + "개");
	
	System.out.println("일원 동전 : " + '\t' +remainingAmount + "개");
	stdin.close();
	}
		}
