package day02;

import java.util.Scanner;

public class Demo14 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("С���ɼ�Ϊ(0~100)��");
		while(true){
			double score=input.nextDouble();
			if(score<0 || score>100){
				System.out.println("������ķ�������ȷ��������������(0~100)");
			}else{
				if(score>90){
					System.out.println("����������");
					break;
				}else if(score>80){
					System.out.println("������ʼǱ�");
					break;
				}else if(score>60){
					System.out.println("�������ֻ�");
					break;
				}else{
					System.out.println("û������");
					break;
				}
			}
		}
	}
}

