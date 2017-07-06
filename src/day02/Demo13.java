package day02;

import java.util.Scanner;

public class Demo13 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("收到压岁钱的数目为：");
		double d=input.nextDouble();
		if(d>1000){
			System.out.println("捐助失学儿童");
		}else{
			if(d<500){
				System.out.println("购买百科全书");
			}else{
				System.out.println("购买航模");
			}
		}
	}
}
