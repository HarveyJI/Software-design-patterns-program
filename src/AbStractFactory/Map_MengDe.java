package AbStractFactory;


public class Map_MengDe extends Map{    //蒙德地图(具体工厂)

	public void showName() {
		System.out.println("--创建蒙德地图---");
	}
	
	public Buidings createBudings() {
		
		return new Buidings_European();
	}

	public Landform createLandfrom() {
		
		return new Landform_Plain();
	}


	public BGM createBGM() {
		
		return new BGM_Classical();
	}

}
