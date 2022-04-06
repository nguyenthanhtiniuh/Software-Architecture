package exmple;

public abstract class Noithat {
	
	protected String maso;
	protected double dongia;
	protected Vatlieu vatlieu;
	
	public Noithat(Vatlieu vatlieu) {
		super();
		this.vatlieu=vatlieu;
		// TODO Auto-generated constructor stub
	}
	public Noithat(String maso, double dongia, Vatlieu vatlieu) {
		super();
		this.maso = maso;
		this.dongia = dongia;
		this.vatlieu = vatlieu;
	}
	
	public Noithat() {
	}

	public String getMaso() {
		return maso;
	}
	public void setMaso(String maso) {
		this.maso = maso;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	
	public abstract String getThongtin() ;
}
