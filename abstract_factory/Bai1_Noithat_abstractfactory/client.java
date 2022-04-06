package Bai1_Noithat_abstractfactory;

public final class client {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INoithatFactory factory = new GoFactory();
		
		Ghego x = (Ghego)factory.createGhe();
		System.out.println(x.getThongtin());
		
		Bango y =(Bango)factory.createBan();
		System.out.println(y.getThongtin());
		
	}

}
