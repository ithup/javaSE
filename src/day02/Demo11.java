package day02;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��������");
		int number=input.nextInt();
		if(number%3==0 && number%5==0){
			System.out.println("������3��5�ı���");
		}
		else{
			System.out.println("false");
		}
	}
}
