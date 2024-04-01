package OCP;

public class Bankpay extends Payment{                     //银行卡支付类
	public void pay(double amount) {
        System.out.println("银行卡支付: " + amount+"元");
    }
}
