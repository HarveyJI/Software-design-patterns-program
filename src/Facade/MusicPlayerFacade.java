package Facade;

public class MusicPlayerFacade extends PlayerAbFacade{       //播放音乐外观类
	private AudioSubsystem audio;                     //音频子系统
	private LyricSubsystem lyric;                     //歌词子系统
	private String filename;                          //文件名
	public MusicPlayerFacade(String filename) {            //构造函数
		 audio=new AudioSubsystem();
		  lyric=new LyricSubsystem();
		  this.filename=filename;
	}
	@Override
	void start() {                          //重写父类播放方法
		audio.audioOutput();
		lyric.lyricOpen();
		System.out.println(filename+"开始播放!");
		
	}
	@Override
	void stop() {                           //重写父类关闭方法
		audio.audioClose();;
		lyric.lyricClose();;
	}
}
