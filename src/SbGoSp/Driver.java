package SbGoSp;
public class Driver {              //司机类
	public String name;            //姓名属性
	public Address destinayion;    //地址类对象
	public JT vehicle;             //交通父类对象
	
	public Driver(String name,Address destinayion,JT vehicle) {   //构造函数   //向上转型  
		this.name=name;
		this.vehicle=vehicle;
		this.destinayion=destinayion;
	}
	
	public void driving() {       //驾驶方法
		System.out.println(name+"坐"+vehicle.getVehicle()+"去"+destinayion.getDestination());
	}
}
