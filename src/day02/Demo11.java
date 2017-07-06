package day02;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int number=input.nextInt();
		if(number%3==0 && number%5==0){
			System.out.println("该数是3或5的倍数");
		}
		else{
			System.out.println("false");
		}
	}
}
