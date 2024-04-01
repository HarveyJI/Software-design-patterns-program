package AbStractFactory;

public class Map_Liyue extends Map{        //璃月地图(具体工厂)

	public void showName() {
		System.out.println("-----创建璃月地图-----");
	}
	
	public Buidings createBudings() {
		
		return new Buidings_Chinese();
	}
	
	public Landform createLandfrom() {
		
		return new Landform_Mountainous();
	}
	
	public BGM createBGM() {
		
		return new BGM_Nation();
	}

}
