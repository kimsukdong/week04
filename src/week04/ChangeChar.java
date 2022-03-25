package week04;

import java.util.Scanner;

public class ChangeChar {
	public static void main (String args[])  {
		String s;
		Scanner scan = new Scanner(System.in);
		char a;
		System.out.print("문자 입력 ");
		s = scan.next();
		a = s.charAt(0);
		if (a >= 'a' && a <= 'z') { // 소문자
			a = (char)(a - ('a' - 'A')); // 대문자로 변환
			System.out.println("변환문자 = "+a);
		}
		else if (a >= 'A' && a <= 'Z') { // 대문자
			a = (char)(a + ('a' - 'A')); // 소문자 변환
			System.out.println("변환문자 = "+a);
		}
		else {
			System.err.println("영문자가 아닙니다.");
		}				
		scan.close();
	}
}
