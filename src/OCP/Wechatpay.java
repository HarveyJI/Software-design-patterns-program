package OCP;

public class Wechatpay extends Payment{                 //微信支付类
	public void pay(double amount) {
        System.out.println("微信支付: " + amount+"元");
    }
}
