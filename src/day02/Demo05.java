package day02;
/**
 * IF���
 * @author acer
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		//1.����֧ѡ��ṹ
		int a=23;
		if(a>2){
			System.out.println("a>2");
			System.out.println("end");
		}
		//2.˫��֧ѡ��ṹ
		//��ϵ���㡢�߼�����
		//boolean���Ͳ��ܺ���������ת��
		int b=44;
		if(a>b){
			System.out.println("a>b");
		}else {
			System.out.println("a<=b");
		}
		System.out.println(a>b?"a>b":"a<=b");
		System.out.println("-----------------------------");
		//3.if��Ƕ��ʹ��
		if(a>b)
			if(a>b)
				System.out.println("a>b");
			else {
				System.out.println("a==b");
			}
		else {
			System.out.println("a<b");
		}
	}
}
