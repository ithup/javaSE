package day02;

import java.util.Scanner;

/**
 * �����
 * 
 * @author acer
 * 
 */
public class Demo1 {
	public static void main(String[] args) {
		// 1.��������
		// �������������������ͺͷ��ӡ���ĸ�е�����������ߵ�����һ��
		// System.out.println(12.3/5);
		// System.out.println(12/5);
		// System.out.println(12.0/5);
		// %��ȡģ��������Ľ���ķ�������ӵķ���һ��
		// System.out.println(12 % 5);//2
		// System.out.println(12 % -5);//2
		// System.out.println(-12 % -5);//-2
		// System.out.println(-12 % 5);//-2
		// ++(����):
		// --(�Լ�):
		// int x=2;
		// int y=(x++)+(++x);
		// System.out.println(x+":"+y);
		// 2.��ֵ����
		// ��ֵ����������һ���Ǳ���,�ұ���һ������
		// int x=2;
		// int y=3;
		// y*=x+5;
		// System.out.println(y);
		Scanner input=new Scanner(System.in);
		System.out.println("�������һ������");
		int a=input.nextInt();//�Ӽ����Ͻ���һ������
		System.out.println("������ڶ�����:");
		int b=input.nextInt();
		System.out.println("�����������:");
		//String op=input.next();//�ڽ���һ���ַ�����ʱ�������س�������
		String op1=input.nextLine();//�ڽ���һ���ַ�����ʱ�������س�������
		int result=0;
		if("+".equals(op1)){
			result=a+b;
		}else{
			result=a-b;
		}
		System.out.println("���Ϊ��"+result);
	}
}
