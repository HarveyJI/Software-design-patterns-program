package Adapter2;

public class Bank extends Renminbi{    //适配者---银行类
	private Dollar dollar;       
	
	public Bank(Dollar dollar) {
		this.dollar = dollar;
	}

	public void Renminbiconsume(int money) {                //消费方法
		
		dollar.transform(money);        //调用父类转化方法
	}		
}
