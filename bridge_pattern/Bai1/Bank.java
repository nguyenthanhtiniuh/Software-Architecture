package Bai1;

public abstract class Bank {
	protected String ten;
	protected String ma;
	protected Account account;
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	
	public Bank(Account account) {
		super();
		this.account = account;
	}
	public Bank(String ten, String ma, Account account) {
		super();
		this.ten = ten;
		this.ma = ma;
		this.account = account;
	}
	@Override
	public String toString() {
		return "Bank [ten=" + ten + ", ma=" + ma + ", account=" + account + "]";
	}
	
	public abstract String getthongtin();
	
	
	
	
	
}
