package Bai1;

public class TBBank extends Bank {

	
	
	public TBBank(String ten, String ma, Account account) {
		super(ten, ma, account);
		// TODO Auto-generated constructor stub
	}

	public TBBank(Account account) {
		super(account);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getthongtin() {
		// TODO Auto-generated method stub
		return "TBBank";
	}

}
