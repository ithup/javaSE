package day02;

import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������a��b����ֵ��");
		int a=input.nextInt();
		int b=input.nextInt();
		if(a%b==0 || a+b==100){
			System.out.println("a:"+a);
		}
		else{
			System.out.println("b:"+b);
		}
	}
}
