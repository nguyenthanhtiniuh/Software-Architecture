package Bai1_Noithat_abstractfactory;

public abstract class Ban extends AbstractNoithat {

	private double dai;
	private double rong;
	
	
	
	public double getDai() {
		return dai;
	}



	public void setDai(double dai) {
		this.dai = dai;
	}



	public double getRong() {
		return rong;
	}



	public void setRong(double rong) {
		this.rong = rong;
	}



	@Override
	public String toString() {
		return "Ban [dai=" + dai + ", rong=" + rong + "]";
	}

	public abstract String getThongtin();
	
	
	public Ban() {
		// TODO Auto-generated constructor stub
	}

}
