package OCPAdvanced;

import OCP.Alipay;
import OCP.Bankpay;
import OCP.Payment;
import OCP.Wechatpay;

public class FactoryA extends Factory{  //工厂A 生产支付宝、微信、银行卡对象

		public Payment product(String s) {
			if(s.equals("支付宝")) {           
			    return (new Alipay());
			 }else if(s.equals("微信") ){   
			    return (new Wechatpay());
			 }else if(s.equals("银行卡")) {
			    return (new Bankpay());
			 }
			return null;
		}
}
	
		
		
