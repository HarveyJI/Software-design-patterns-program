package AbStractFactory;

public class Developer {                //开发者  (客户端)

	public static void main(String[] args) {
		
		Map m=new Map_Liyue();  //创建璃月地图
		m.showName();
		m.createLandfrom().generateLandform();
		m.createBudings().creatingBuidings();
		m.createBGM().playMusic();

		 m=new Map_MengDe();  //创建蒙德地图
		m.showName();
		m.createLandfrom().generateLandform();
		m.createBudings().creatingBuidings();
		m.createBGM().playMusic();
	}

}
