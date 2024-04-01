package AbStractFactory;

abstract class Map {                 //地图 (抽象工厂)
	public abstract Buidings createBudings();   //建造建筑
	public abstract Landform createLandfrom();  //生成地形
	public abstract BGM createBGM();             //播放音乐
	public abstract void showName();             //地图名字
}
