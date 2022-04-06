package Bai1;

public class client {

	public static void main(String[] args) {
		Account ac = new CheckkingAccount();
		
		TBBank tb = new TBBank("tb","tb",ac);
		System.out.println(tb.getthongtin());
		
		// TODO Auto-generated method stub
		
		VietcomBank vc = new VietcomBank("vc","vc",ac);
		System.out.println(vc.getthongtin());
		
		
	}

}
