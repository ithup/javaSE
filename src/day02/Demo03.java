package day02;

import java.util.Scanner;

/**
 * ��ϵ�����
 * 
 * @author acer
 * 
 */
public class Demo03 {
	public static void main(String[] args) {
		// ģ���¼����
		Scanner input = new Scanner(System.in);
		System.out.println("�������û�����");
		String username = input.next();
		System.out.println("���������룺");
		String password = input.next();
		// ��֪�ķ���ǰ��
		/* equals:�����ϵıȽ�
		 * 		public boolean equals(Object anObject)
		 * 			ָʾ����ĳ�������Ƿ���˶�����ȡ�
		 * 			�����ַ�����ָ���Ķ���Ƚϡ����ҽ����ò�����Ϊ null��
		 * 			��������˶����ʾ��ͬ�ַ����е� String ����ʱ�������Ϊ true��
		 * 
		 */
		if ("tom".equals(username) && "123".equals(password)) {
			System.out.println("��¼�ɹ���");
		} else {
			System.out.println("��¼ʧ�ܣ�");
		}
	}
}
