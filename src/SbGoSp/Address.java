package SbGoSp;
public class Address {            //地址类
	private String destination;   //目的地属性
	
	public Address(String destination) {  //构造函数
		this.destination=destination;
	}
	
	public String getDestination() { //获得目的地属性
		return destination;
	}

	/*public void setDestination(String destination) {
		this.destination = destination;
	}*/
}
