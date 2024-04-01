package Adapter;

import java.util.Scanner;

public class Client {         //客户端类
	private static Renminbi use;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		use=new Bank();    //使用人民币消费通过银行,转化为使用美元消费
		System.out.println("使用人民币消费:"); 
		int money=sc.nextInt();
		
		use.Renminbiconsume(money);
	}

}
