package OCP;

public class Alipay extends Payment{                           //支付宝支付类
	public void pay(double amount) {
        System.out.println("支付宝支付: " + amount+"元");
    }
}
