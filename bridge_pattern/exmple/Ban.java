package exmple;

public class Ban extends Noithat{
	
	private int dai;
	private int rong;
	
	public Ban(Vatlieu vatlieu) {
		super(vatlieu);
	}

	public Ban(String maso, double dongia, Vatlieu vatlieu, int dai, int rong) {
		super(maso, dongia, vatlieu);
		this.dai = dai;
		this.rong = rong;
	}

	public int getDai() {
		return dai;
	}

	public void setDai(int dai) {
		this.dai = dai;
	}

	public int getRong() {
		return rong;
	}

	public void setRong(int rong) {
		this.rong = rong;
	}

	@Override
	public String toString() {
		return "Ban [dai=" + dai + ", rong=" + rong + "]";
	}

	@Override
	public String getThongtin() {
		// TODO Auto-generated method stub
		return "Ban";
	}

	
	
	
//	@Override
//	public String getThongtin() {
//		return "Ban " + dai + "x" + rong + "(" + vatlieu.getMota()+")";
//	}
	
	
}
