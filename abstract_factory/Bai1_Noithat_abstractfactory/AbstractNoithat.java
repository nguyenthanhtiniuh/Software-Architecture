package Bai1_Noithat_abstractfactory;

public abstract class AbstractNoithat {

	public AbstractNoithat() {
		// TODO Auto-generated constructor stub
	}
	protected double dongia;
	protected int maso;
	
	
	
	public double getDongia() {
		return dongia;
	}



	public void setDongia(double dongia) {
		this.dongia = dongia;
	}



	public int getMaso() {
		return maso;
	}



	public void setMaso(int maso) {
		this.maso = maso;
	}

	
	

	@Override
	public String toString() {
		return "AbstractNoithat [dongia=" + dongia + ", maso=" + maso + "]";
	}

	public abstract String getThongtin(); 
		// TODO Auto-generated method stub

	

}
