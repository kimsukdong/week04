package week04;

import java.util.*;
public class Weight {
	public static void main(String[] args){
		double weight, stWeight, height, bmi;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���(cm)");
		height = scan.nextDouble();
		height /=100;
		System.out.println("�����Ը� �Է��ϼ���(Kg)");
		weight = scan.nextDouble();
				
		bmi = weight / (height*height);
		
		if(bmi>=30) 
			System.out.println("��");
		else if(bmi>=25)
			System.out.println("��ü��");
		else if(bmi>=18.5)
			System.out.println("����");
		else 
			System.out.println("��ü��");
		
		scan.close();
	  	}
}
