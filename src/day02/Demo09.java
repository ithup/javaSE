package day02;

import java.util.Scanner;

public class Demo09 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("���������䣺");
		int age=input.nextInt();
		System.out.println("�������Ա�");
		String sex=input.next();
		if(age>7 || age>5 && "��".equals(sex)){
			System.out.println("���С�����԰ᶯ����");
		}
		else{
			System.out.println("���С�������԰ᶯ����");
			
		}
	}
}
