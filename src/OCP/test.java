package OCP;
import java.util.Scanner;

public class test {                              //测试类

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("请输入支付方式:");
		String s=sc.next();
		
		Payment pay = Factory.product_who(s);     //通过工厂以及输入支付方式生成对应对象
		if(pay!=null)
		pay.pay(5.0);     	                     //调用方法输出
		                    
	}
}

