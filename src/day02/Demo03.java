package day02;

import java.util.Scanner;

/**
 * 关系运算符
 * 
 * @author acer
 * 
 */
public class Demo03 {
	public static void main(String[] args) {
		// 模拟登录操作
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username = input.next();
		System.out.println("请输入密码：");
		String password = input.next();
		// 已知的放在前面
		/* equals:内容上的比较
		 * 		public boolean equals(Object anObject)
		 * 			指示其他某个对象是否与此对象“相等”
		 * 			将此字符串与指定的对象比较。当且仅当该参数不为 null，
		 * 			并且是与此对象表示相同字符序列的 String 对象时，结果才为 true。
		 * 
		 */
		if ("tom".equals(username) && "123".equals(password)) {
			System.out.println("登录成功！");
		} else {
			System.out.println("登录失败！");
		}
	}
}
