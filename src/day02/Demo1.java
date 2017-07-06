package day02;

import java.util.Scanner;

/**
 * 运算符
 * 
 * @author acer
 * 
 */
public class Demo1 {
	public static void main(String[] args) {
		// 1.算术运算
		// 除法运算符：结果的类型和分子、分母中的数据类型最高的哪项一致
		// System.out.println(12.3/5);
		// System.out.println(12/5);
		// System.out.println(12.0/5);
		// %（取模）：运算的结果的符号与分子的符号一致
		// System.out.println(12 % 5);//2
		// System.out.println(12 % -5);//2
		// System.out.println(-12 % -5);//-2
		// System.out.println(-12 % 5);//-2
		// ++(自增):
		// --(自减):
		// int x=2;
		// int y=(x++)+(++x);
		// System.out.println(x+":"+y);
		// 2.赋值运算
		// 赋值运算符的左边一定是变量,右边是一个整体
		// int x=2;
		// int y=3;
		// y*=x+5;
		// System.out.println(y);
		Scanner input=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a=input.nextInt();//从键盘上接收一个整数
		System.out.println("请输入第二个数:");
		int b=input.nextInt();
		System.out.println("请输入运算符:");
		//String op=input.next();//在接收一个字符串的时候，遇到回车符结束
		String op1=input.nextLine();//在接收一个字符串的时候，遇到回车符结束
		int result=0;
		if("+".equals(op1)){
			result=a+b;
		}else{
			result=a-b;
		}
		System.out.println("结果为："+result);
	}
}
