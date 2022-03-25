package week04;

import java.util.Scanner;

public class CountChar {
	public static void main(String[] args){
		String s;
		boolean cs = true;
		Scanner scan = new Scanner(System.in);
		while(cs) {
		
		System.out.print("문자를 입력하세요 ");
		s = scan.next();
		char c = s.charAt(0);
		if (c >= 'A' && c <= 'Z') // 대문자
			c = (char)(c + ('a' - 'A')); // 소문자 변환
		switch(c){
			case 'a': 	case 'i': 	case 'o':  case 'u': case 'e':
				System.out.println("모음입니다.");
				break;
			case 'b': 	case 'c': 	case 'd':  case 'f': case 'g':
			case 'h': 	case 'j': 	case 'k':  case 'l': case 'm':
			case 'n': 	case 'p': 	case 'q':  case 'r': case 's':
			case 't': 	case 'v': 	case 'w':  case 'x': case 'y': case 'z':
				System.out.println("자음입니다.");
				break;
			case '1': 	case '2': 	case '3':  case '4': case '5':
			case '6': 	case '7': 	case '8':  case '9': case '0':
				System.out.println("숫자입니다.");
				break;
			default: 
				System.out.println("특수 문자입니다.");
		}	
			System.out.print("계속 여부 (y/n) ");	
			s = scan.next();
			c = s.charAt(0);
			System.out.println(" ");
			if(c=='n')  {
				System.out.println("종료합니다. ");	
				cs = false;
			}
		   
		}
				
		scan.close();
		

	}
}
