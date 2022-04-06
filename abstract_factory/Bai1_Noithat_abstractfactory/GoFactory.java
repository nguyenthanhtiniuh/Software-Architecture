package Bai1_Noithat_abstractfactory;

public class GoFactory implements INoithatFactory {

	

	@Override
	public Ban createBan() {
		// TODO Auto-generated method stub
		return new Bango();
	}

	@Override
	public Ghe createGhe() {
		// TODO Auto-generated method stub
		return new Ghego();
	}
	

}
