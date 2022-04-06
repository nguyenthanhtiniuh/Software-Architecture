package Bai1;

public class VietcomBank extends Bank{

	public VietcomBank(String ten, String ma, Account account) {
		super(ten, ma, account);
		// TODO Auto-generated constructor stub
	}
	
	public VietcomBank(Account account) {
		super(account);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getthongtin() {
		// TODO Auto-generated method stub
		return "VietcomBank";
	}

}
