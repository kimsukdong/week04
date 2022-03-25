package week04;

import java.util.Scanner;

public class InputChar {
	public static void main (String args[])  {
		String s;
		Scanner scan = new Scanner(System.in);
		char a;
		
			System.out.print("하나의 문자를 입력하시오 : ");
			s = scan.next();
			a = s.charAt(0);
			System.out.println("입력한 문자는 : "+ a + " (" + (int)a + ")" ); // 입력된 문자 출력

		scan.close();
	}
}
