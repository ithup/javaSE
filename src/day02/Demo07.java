package day02;

import java.util.Scanner;

public class Demo07 {
	public static void main(String[] args) {
		/*
		 * �Ӽ���������һ���ɼ����������óɼ��ֵȼ���
		 * 60������-��������60-70-������
		 * 70-79���е�
		 * 80-89����
		 * 90-100����
		 * */
		Scanner input=new Scanner(System.in);
		System.out.println("���������(0~100)��");
		int score=input.nextInt();
		int num=0;
		num=score/10;
		while(true){
			if(score<0 || score>100){
				System.out.println("��������ȷ������0~100��");
			}
			else{
				switch(num){
				case 7:
					System.out.println("�е�");
					break;
				case 8:
					System.out.println("����");
					break;
				case 9:
					System.out.println("����");
					break;
				default:
					System.out.println("������");
				}
			}
		}
	}
}
