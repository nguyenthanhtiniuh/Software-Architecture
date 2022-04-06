package Bai2_Nganhang_factorymethod;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INganhangFactory factory = new NganhangFactory();
		
		ViettinBank viettinbank=(ViettinBank)factory.createNganhang("viettinbank");
		System.out.println(viettinbank.getThongtin());
	}

}
