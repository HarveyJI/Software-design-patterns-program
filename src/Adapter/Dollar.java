package Adapter;

public class Dollar {                       //源角色---使用美元消费
	public void transform(int money) {        //转化美元消费方法
		System.out.println("转化为美元消费:"+(int)(money/6.5));
	}	
}

