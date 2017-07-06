package day02;
/**
 * IF语句
 * @author acer
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		//1.单分支选择结构
		int a=23;
		if(a>2){
			System.out.println("a>2");
			System.out.println("end");
		}
		//2.双分支选择结构
		//关系运算、逻辑运算
		//boolean类型不能和其他类型转换
		int b=44;
		if(a>b){
			System.out.println("a>b");
		}else {
			System.out.println("a<=b");
		}
		System.out.println(a>b?"a>b":"a<=b");
		System.out.println("-----------------------------");
		//3.if的嵌套使用
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
