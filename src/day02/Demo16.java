package day02;

import java.util.Scanner;

public class Demo16 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入消费金额：");
		double amount=input.nextDouble();
		System.out.println("是否参加优惠换购活动：");
		System.out.println("1:满50元，加2元换购百事可乐饮料1瓶");
		System.out.println("2:满100元，加3元换购500ml可乐1瓶");
		System.out.println("3:满100元，加10元换购5公斤面粉");
		System.out.println("4:满200元，加10元换购1个苏波尔炒菜锅");
		System.out.println("5:满200元，加20元换购欧莱雅爽肤水一瓶");
		System.out.println("0:不换购");
		System.out.print("请选择：");
		int choice=input.nextInt();
		switch(choice){
		case 0:
			System.out.println("本次消费总金额："+amount+"\n"+"本次不换购");
			break;
		case 1:
			System.out.println("本次消费总金额："+(amount+2)+"\n"+"成功换购：百事可乐饮料1瓶");
			break;
		case 2:
			System.out.println("本次消费总金额："+(amount+3)+"\n"+"成功换购：500ml可乐1瓶");
			break;
		case 3:
			System.out.println("本次消费总金额："+(amount+10)+"\n"+"成功换购：5公斤面粉");
			break;
		case 4:
			System.out.println("本次消费总金额："+(amount+10)+"\n"+"成功换购：1个苏波尔炒菜锅");
			break;
		case 5:
			System.out.println("本次消费总金额："+(amount+20)+"\n"+"成功换购：欧莱雅爽肤水一瓶");
			break;
		}
	}
}
