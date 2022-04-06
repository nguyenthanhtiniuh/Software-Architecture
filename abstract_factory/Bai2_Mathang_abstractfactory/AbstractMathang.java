package Bai2_Mathang_abstractfactory;

public abstract class AbstractMathang {
	private double dongia;
	private double maso;
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public double getMaso() {
		return maso;
	}
	public void setMaso(double maso) {
		this.maso = maso;
	}
	@Override
	public String toString() {
		return "AbstractMathang [dongia=" + dongia + ", maso=" + maso + "]";
	}
	
	public abstract String getThongtin();
	
}
