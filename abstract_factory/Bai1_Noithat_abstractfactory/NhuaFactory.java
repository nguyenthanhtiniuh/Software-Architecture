package Bai1_Noithat_abstractfactory;

public class NhuaFactory implements INoithatFactory{

	

	@Override
	public Ban createBan() {
		// TODO Auto-generated method stub
		return new Bannhua();
	}

	@Override
	public Ghe createGhe() {
		// TODO Auto-generated method stub
		return new Ghenhua();
	}

}
