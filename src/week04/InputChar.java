package week04;

import java.util.Scanner;

public class InputChar {
	public static void main (String args[])  {
		String s;
		Scanner scan = new Scanner(System.in);
		char a;
		
			System.out.print("�ϳ��� ���ڸ� �Է��Ͻÿ� : ");
			s = scan.next();
			a = s.charAt(0);
			System.out.println("�Է��� ���ڴ� : "+ a + " (" + (int)a + ")" ); // �Էµ� ���� ���

		scan.close();
	}
}
