package day02;

import java.util.Scanner;

public class Demo13 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�յ�ѹ��Ǯ����ĿΪ��");
		double d=input.nextDouble();
		if(d>1000){
			System.out.println("����ʧѧ��ͯ");
		}else{
			if(d<500){
				System.out.println("����ٿ�ȫ��");
			}else{
				System.out.println("����ģ");
			}
		}
	}
}
