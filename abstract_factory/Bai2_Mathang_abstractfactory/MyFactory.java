package Bai2_Mathang_abstractfactory;

public class MyFactory implements IMathangFactory{

	@Override
	public Quanao createQuanao() {
		// TODO Auto-generated method stub
		return new QuanaoMy();
	}

	@Override
	public Giaydep createGiaydep() {
		// TODO Auto-generated method stub
		return new GiaydepMy();
	}

}
