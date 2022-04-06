package Bai2_Mathang_abstractfactory;

public class AnhFactory implements IMathangFactory{

	@Override
	public Quanao createQuanao() {
		// TODO Auto-generated method stub
		return new QuanaoAnh();
	}

	@Override
	public Giaydep createGiaydep() {
		// TODO Auto-generated method stub
		return new GiaydepAnh();
	}

}
