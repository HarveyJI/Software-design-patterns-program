package SbGoSp; 
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("请输入目的地:");     
		String d_s=sc.next();
		System.out.println("请输入出行方式:");
		String v_s=sc.next();
		
		Address a=new Address(d_s);     //创建地址对象
		JT v=null ;                     //创建交通对象
		
	    try {  //异常处理
	    	
	    	if(v_s.equals("高铁")) {           //按照出行方式创建交通子类对象
	    		v=new Subway();
	    	}else if(v_s.equals("公交汽车") ){   
	    		v=new Bus();
	    	}
	    	Driver d=new Driver("Harvey",a,v); //创建司机对象
	    	d.driving();;                       //调用司机对象的驾驶方法
			
	    }catch(NullPointerException e){
	    	System.out.println("出行方式错误");                     
	    }
		
		
	}

}
