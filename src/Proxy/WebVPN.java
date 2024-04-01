package Proxy;

public class WebVPN extends Web{    //代理
	private XinHuaWeb xhWeb;
	
	public WebVPN() {
		this.xhWeb=new XinHuaWeb();
	}
	
	public  void preRequset() {
		System.out.println("VPN开始代理....");
	}
	
	public  void postRequset() {
		System.out.println("代理结束....");
	}
	
	public  void requset() {   //重写抽象方法
		preRequset();
		xhWeb.requset();
		postRequset();
	}
		
}