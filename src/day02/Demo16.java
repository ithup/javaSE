package day02;

import java.util.Scanner;

public class Demo16 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("���������ѽ�");
		double amount=input.nextDouble();
		System.out.println("�Ƿ�μ��Żݻ������");
		System.out.println("1:��50Ԫ����2Ԫ�������¿�������1ƿ");
		System.out.println("2:��100Ԫ����3Ԫ����500ml����1ƿ");
		System.out.println("3:��100Ԫ����10Ԫ����5�������");
		System.out.println("4:��200Ԫ����10Ԫ����1���ղ������˹�");
		System.out.println("5:��200Ԫ����20Ԫ����ŷ����ˬ��ˮһƿ");
		System.out.println("0:������");
		System.out.print("��ѡ��");
		int choice=input.nextInt();
		switch(choice){
		case 0:
			System.out.println("���������ܽ�"+amount+"\n"+"���β�����");
			break;
		case 1:
			System.out.println("���������ܽ�"+(amount+2)+"\n"+"�ɹ����������¿�������1ƿ");
			break;
		case 2:
			System.out.println("���������ܽ�"+(amount+3)+"\n"+"�ɹ�������500ml����1ƿ");
			break;
		case 3:
			System.out.println("���������ܽ�"+(amount+10)+"\n"+"�ɹ�������5�������");
			break;
		case 4:
			System.out.println("���������ܽ�"+(amount+10)+"\n"+"�ɹ�������1���ղ������˹�");
			break;
		case 5:
			System.out.println("���������ܽ�"+(amount+20)+"\n"+"�ɹ�������ŷ����ˬ��ˮһƿ");
			break;
		}
	}
}
