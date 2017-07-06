package day02;

import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入坏鸡蛋数量：");
		int number=input.nextInt();
		if(number<5){
			System.out.println("忍了！，吃掉算了");
		}else{
			System.out.println("退货！");
		}
	}
}
