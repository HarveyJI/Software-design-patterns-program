package OCPAdvanced;
import java.util.Scanner;
import OCP.Payment;

public class test1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("请输入支付方式:");
		String s=sc.next();
		
		Factory f=new FactoryA();                  //生成工厂A对象
		Payment pay = f.product(s);                //通过工厂A生产相应对象
		
		Factory f1=new FactoryB();                 //生成工厂B对象
		Payment pay1 = f1.product(s);              //通过工厂B生产相应对象
		                  
		if(pay!=null) {                            //输出
			pay.pay(5.0);
		}else if(pay1!=null){
			pay1.pay(5.0);
		}
		
}
	}
