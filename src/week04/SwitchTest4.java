package week04;
import java.util.Scanner;
// ��ҹ��� ���о��� ���� �Է��ϴ� ���
public class SwitchTest4 {
	public static void main(String args[]) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(������) : ");
		String month = stdin.next();
		
		// ��ҹ��ڸ� ��� �ҹ��ڷ� ��ȯ �Ѵ�.
		int i = month.length();
		char c1,c2;
		for(int k =0; k<i; k++)
		{
			c1= month.charAt(k);
			c2=c1;
			if (c1 >= 'A' && c1 <= 'Z') // �빮��
				c2 = (char)(c1 + ('a' - 'A')); // �ҹ��� ��ȯ
			month = month.replace(c1,c2);
		}

		//���� ���� �Ѵ�
		String MtoS;
		switch (month)
		{
			case "december":
			case "january":
			case "february":
				MtoS = "�ܿ��Դϴ�.";
				break;
			case "march":
			case "april":
			case "may":
				MtoS = "���Դϴ�.";
				break;
			case "june":
			case "july":
			case "august":
				MtoS = "�����Դϴ�.";
				break;
			case "september":
				System.out.print("���� 9���� ");
			case "october":
				System.out.print("�Ƹ��ٿ� 10���� ");
			case "november":
				System.out.print("������ 11���� ");
				MtoS = "�����Դϴ�.";
				break;
			default:
				MtoS = "1~12���� ��� ���Դϴ�.";
				break;
		}
		System.out.println(MtoS);
		stdin.close();
	}
}