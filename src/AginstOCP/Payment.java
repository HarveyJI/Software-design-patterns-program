package AginstOCP;
import java.util.Scanner;
public class Payment {
	public void pay1(double amount) {//支付方式
        System.out.println("支付宝支付: " + amount+"元");
    }
	public void pay2(double amount) {
        System.out.println("微信支付: " + amount+"元");
    }
	public void pay3(double amount) {
        System.out.println("银行卡支付: " + amount+"元");
    }
	public void pay4(double amount) {
        System.out.println("苹果支付: " + amount+"元");
    }
	public static void main(String[] args) {    //主函数

		Payment a=new Payment();     //构造对象
		double b=5.0;
	   Scanner sc= new Scanner(System.in);
		System.out.println("请输入支付方式:");
		String s=sc.next();          //输入语句
		if(s.equals("支付宝")) {           
			a.pay1(b);
		}else if(s.equals("微信") ){   
			a.pay2(b);
		}else if(s.equals("银行卡")) {
			a.pay3(b);
		}else if(s.equals("苹果")) {
			a.pay4(b);
			}
		}
}
