package week04;

import java.util.Scanner;

public class ExamTest {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("중간고사 점수(최대 30점) ? ");
		int x1 = stdin.nextInt();
		
		System.out.print("기말고사 점수(최대 30점) ? ");
		int x2 = stdin.nextInt();
		
		System.out.print("출석 점수(최대 20점) ? ");
		int x3 = stdin.nextInt();
		
		System.out.print("평소고사 점수(최대 20점) ? ");
		int x4 = stdin.nextInt();
		
		int sum = x1+x2+x3+x4;
		String p;

		if(sum>59)
			if(sum>64)
				if(sum>69)
					if(sum>74)
						if(sum >79)
							if(sum >84)
								if(sum >89)
									if(sum >94)
										p="A+";
									else p="A0";
								else p="B+";
							else p="B0";
						else p="C+";
					else p="C0";
				else p="D+";
			else p="D0";
		else p="F";
	
		System.out.println( "총점 = "+ sum + " , 평점 = " + p);
		stdin.close();
	}
}
