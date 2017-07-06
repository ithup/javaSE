package day02;

import java.util.Scanner;

/**
 * 从键盘输入三个整数，比较它们的大小（按从小到大的顺序输出来）
 * @author acer
 *
 */
public class Demo15 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int max=0;
		int min=0;
		System.out.println("请输入第一个整数：");
		int a=input.nextInt();
		System.out.println("请输入第二个整数：");
		int b=input.nextInt();
		System.out.println("请输入第三个整数：");
		int c=input.nextInt();
		if(a>b){
			max=a;
			
		}
	}
}
