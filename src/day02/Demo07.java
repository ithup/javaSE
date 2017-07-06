package day02;

import java.util.Scanner;

public class Demo07 {
	public static void main(String[] args) {
		/*
		 * 从键盘上输入一个成绩，再来给该成绩分等级；
		 * 60分以下-》不及格；60-70-》及格
		 * 70-79分中等
		 * 80-89良好
		 * 90-100优秀
		 * */
		Scanner input=new Scanner(System.in);
		System.out.println("请输入分数(0~100)：");
		int score=input.nextInt();
		int num=0;
		num=score/10;
		while(true){
			if(score<0 || score>100){
				System.out.println("请输入正确分数（0~100）");
			}
			else{
				switch(num){
				case 7:
					System.out.println("中等");
					break;
				case 8:
					System.out.println("良好");
					break;
				case 9:
					System.out.println("优秀");
					break;
				default:
					System.out.println("不及格");
				}
			}
		}
	}
}
