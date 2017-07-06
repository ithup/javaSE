package day02;

public class Demo04 {
	public static void main(String[] args) {
		//1.ß‰Ý‹ß\Ëã
		int a=2;
		int b=3;
		//ß\Ëã¼‰„e£ºËãÐgß\Ëã·û>êP‚Sß\Ëã·û>ß‰Ý‹ß\Ëã>ÙxÖµß\Ëã·û
		/*if(a++<b-- || ++a>++b){
			System.out.println("½Y¹ûžé£º"+a+":"+b);
		}else {
			System.out.println("½Y¹ûžé:"+a+":"+b);
		}*/
		String c = a>b?"a>b":"a<=b";
		System.out.println(c);
	}
}
