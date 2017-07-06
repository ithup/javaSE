package day02;

import java.util.Scanner;

public class Demo09 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入年龄：");
		int age=input.nextInt();
		System.out.println("请输入性别：");
		String sex=input.next();
		if(age>7 || age>5 && "男".equals(sex)){
			System.out.println("这个小孩可以搬动桌子");
		}
		else{
			System.out.println("这个小孩不可以搬动桌子");
			
		}
	}
}
