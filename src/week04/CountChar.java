package week04;

import java.util.Scanner;

public class CountChar {
	public static void main(String[] args){
		String s;
		boolean cs = true;
		Scanner scan = new Scanner(System.in);
		while(cs) {
		
		System.out.print("���ڸ� �Է��ϼ��� ");
		s = scan.next();
		char c = s.charAt(0);
		if (c >= 'A' && c <= 'Z') // �빮��
			c = (char)(c + ('a' - 'A')); // �ҹ��� ��ȯ
		switch(c){
			case 'a': 	case 'i': 	case 'o':  case 'u': case 'e':
				System.out.println("�����Դϴ�.");
				break;
			case 'b': 	case 'c': 	case 'd':  case 'f': case 'g':
			case 'h': 	case 'j': 	case 'k':  case 'l': case 'm':
			case 'n': 	case 'p': 	case 'q':  case 'r': case 's':
			case 't': 	case 'v': 	case 'w':  case 'x': case 'y': case 'z':
				System.out.println("�����Դϴ�.");
				break;
			case '1': 	case '2': 	case '3':  case '4': case '5':
			case '6': 	case '7': 	case '8':  case '9': case '0':
				System.out.println("�����Դϴ�.");
				break;
			default: 
				System.out.println("Ư�� �����Դϴ�.");
		}	
			System.out.print("��� ���� (y/n) ");	
			s = scan.next();
			c = s.charAt(0);
			System.out.println(" ");
			if(c=='n')  {
				System.out.println("�����մϴ�. ");	
				cs = false;
			}
		   
		}
				
		scan.close();
		

	}
}
