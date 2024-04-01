package Facade;

public class VideoPlayerFacade extends PlayerAbFacade{              //播放视频外观类
	private VideoSubsystem video;                        //视频子系统
	private SubtitlesSubsystem subtitles;                //字幕子系统
	private AudioSubsystem audio;                        //音频子系统
	private String filename;                             //文件名
	
	public VideoPlayerFacade(String filename) {                         //构造函数
		  video=new VideoSubsystem();
		  subtitles=new SubtitlesSubsystem();
		 audio=new AudioSubsystem() ;
		 this.filename=filename;
	}
	@Override
	void start() {                                       //重写父类播放方法
		video.screenOutput();
		audio.audioOutput();
		subtitles.subtitleOpen();	
		System.out.println(filename+"开始播放!");
	}
	@Override
	void stop() {                                        //重写父类关闭方法
		video.screenClose();
		audio.audioClose();
		subtitles.subtitleClose();	
	}
}
