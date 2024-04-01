package Facade;

import java.util.Scanner;



public class Client {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
		System.out.println();
		System.out.println("请输入文件名:");
		String filename=sc.next();
		PlayerAbFacade player;
		String[] form=filename.split("\\.");            //提取后缀名
		
		System.out.println();
		if(form[1].equals("mp4")) {      //判断文件类型
			 player=new VideoPlayerFacade(form[0]);    //实例化视频播放外观类对象
			 player.start();
			 System.out.println();
			 player.stop();
		}else if(form[1].equals("mp3")) {
			player=new MusicPlayerFacade(form[0]);      //实例化音乐播放外观类对象
			player.start();
			System.out.println();
			player.stop();
		}	
	}
		}
		
}
