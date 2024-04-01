package SimpleFactory;

public class AliLogin implements Login{                           //支付宝登陆类

	public void logging(String account) {
	System.out.println("支付宝登陆--->账号:" + account);	
	}
}
