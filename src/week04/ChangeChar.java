package week04;

import java.util.Scanner;

public class ChangeChar {
	public static void main (String args[])  {
		String s;
		Scanner scan = new Scanner(System.in);
		char a;
		System.out.print("���� �Է� ");
		s = scan.next();
		a = s.charAt(0);
		if (a >= 'a' && a <= 'z') { // �ҹ���
			a = (char)(a - ('a' - 'A')); // �빮�ڷ� ��ȯ
			System.out.println("��ȯ���� = "+a);
		}
		else if (a >= 'A' && a <= 'Z') { // �빮��
			a = (char)(a + ('a' - 'A')); // �ҹ��� ��ȯ
			System.out.println("��ȯ���� = "+a);
		}
		else {
			System.err.println("�����ڰ� �ƴմϴ�.");
		}				
		scan.close();
	}
}
