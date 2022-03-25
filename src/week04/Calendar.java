package week04;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		boolean isLeap;
		int year;

		Scanner sc = new Scanner(System.in);
		System.out.print("해당 년도를 입력하시오: ");
		year = sc.nextInt();
		isLeap = (year %4 ==0 && year % 100 != 0) || (year %400 == 0);
		if(isLeap) System.out.println(year + "년은 윤년 입니다.");
			else System.out.println(year + "년은 평년 입니다.");
		
		sc.close();
	}
}
