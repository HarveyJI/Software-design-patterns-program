package OCP;

public class Factory {        //工厂类 工具输入生成对应支付类子类对象
		
	public static Payment product_who(String s) {
		 if(s.equals("支付宝")) {           
			    return (new Alipay());
			 }else if(s.equals("微信") ){   
			    return (new Wechatpay());
			 }else if(s.equals("银行卡")) {
			    return (new Bankpay());
			 }else if(s.equals("苹果")) {
				    return (new Applepay());
				 }
		return null;
	 }	
}
	
