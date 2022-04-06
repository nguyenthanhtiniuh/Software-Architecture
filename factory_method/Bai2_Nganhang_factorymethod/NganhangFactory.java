package Bai2_Nganhang_factorymethod;

public class NganhangFactory implements INganhangFactory{

	@Override
	public AbstractNganhang createNganhang(String loainganhang) {
		// TODO Auto-generated method stub
		loainganhang = loainganhang.toLowerCase();
		switch(loainganhang) {
		case"achaubank":
			return new AchauBank();
		case"sacombank":
			return new SacomBank();
		case"viettinbank":
			return new ViettinBank();
		default:
			break;
		}			
		return null;
	}

}
