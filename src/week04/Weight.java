package week04;

import java.util.*;
public class Weight {
	public static void main(String[] args){
		double weight, stWeight, height, bmi;
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력하세요(cm)");
		height = scan.nextDouble();
		height /=100;
		System.out.println("몸무게를 입력하세요(Kg)");
		weight = scan.nextDouble();
				
		bmi = weight / (height*height);
		
		if(bmi>=30) 
			System.out.println("비만");
		else if(bmi>=25)
			System.out.println("과체중");
		else if(bmi>=18.5)
			System.out.println("정상");
		else 
			System.out.println("저체중");
		
		scan.close();
	  	}
}
