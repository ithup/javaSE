package day02;

public class Demo04 {
	public static void main(String[] args) {
		//1.߉݋�\��
		int a=2;
		int b=3;
		//�\�㼉�e�����g�\���>�P�S�\���>߉݋�\��>�xֵ�\���
		/*if(a++<b-- || ++a>++b){
			System.out.println("�Y���飺"+a+":"+b);
		}else {
			System.out.println("�Y����:"+a+":"+b);
		}*/
		String c = a>b?"a>b":"a<=b";
		System.out.println(c);
	}
}
