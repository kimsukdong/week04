package week04;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		boolean isLeap;
		int year;

		Scanner sc = new Scanner(System.in);
		System.out.print("�ش� �⵵�� �Է��Ͻÿ�: ");
		year = sc.nextInt();
		isLeap = (year %4 ==0 && year % 100 != 0) || (year %400 == 0);
		if(isLeap) System.out.println(year + "���� ���� �Դϴ�.");
			else System.out.println(year + "���� ��� �Դϴ�.");
		
		sc.close();
	}
}
