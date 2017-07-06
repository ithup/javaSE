package day02;

import java.util.Scanner;

public class Demo14 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("小明成绩为(0~100)：");
		while(true){
			double score=input.nextDouble();
			if(score<0 || score>100){
				System.out.println("你输入的分数不正确！请从新输入分数(0~100)");
			}else{
				if(score>90){
					System.out.println("给他买辆车");
					break;
				}else if(score>80){
					System.out.println("给他买笔记本");
					break;
				}else if(score>60){
					System.out.println("给他买部手机");
					break;
				}else{
					System.out.println("没有礼物");
					break;
				}
			}
		}
	}
}

