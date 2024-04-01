package Adapter;

public class Bank extends Dollar implements Renminbi {    //适配者---银行类
	public void Renminbiconsume(int money) {                //人民币消费方法
		super.transform(money);        //调用父类转化为美元消费方法
	}		
}
