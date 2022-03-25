package week04;
import java.util.Scanner;
// 대소문자 구분없이 달을 입력하는 방법
public class SwitchTest4 {
	public static void main(String args[]) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("월을 입력하세요(영문자) : ");
		String month = stdin.next();
		
		// 대소문자를 모수 소문자로 변환 한다.
		int i = month.length();
		char c1,c2;
		for(int k =0; k<i; k++)
		{
			c1= month.charAt(k);
			c2=c1;
			if (c1 >= 'A' && c1 <= 'Z') // 대문자
				c2 = (char)(c1 + ('a' - 'A')); // 소문자 변환
			month = month.replace(c1,c2);
		}

		//계절 구분 한다
		String MtoS;
		switch (month)
		{
			case "december":
			case "january":
			case "february":
				MtoS = "겨울입니다.";
				break;
			case "march":
			case "april":
			case "may":
				MtoS = "봄입니다.";
				break;
			case "june":
			case "july":
			case "august":
				MtoS = "여름입니다.";
				break;
			case "september":
				System.out.print("멋진 9월과 ");
			case "october":
				System.out.print("아름다운 10월과 ");
			case "november":
				System.out.print("낙엽의 11월은 ");
				MtoS = "가을입니다.";
				break;
			default:
				MtoS = "1~12월을 벗어난 달입니다.";
				break;
		}
		System.out.println(MtoS);
		stdin.close();
	}
}