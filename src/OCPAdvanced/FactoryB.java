package OCPAdvanced;

import OCP.Applepay;
import OCP.Payment;

public class FactoryB extends Factory{               //具体工厂B
	
	public Payment product(String s) {              //新增生产苹果支付类对象
		return (new Applepay());       
	}
}
