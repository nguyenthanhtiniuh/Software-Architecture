package exmple;

public class Ghe extends Noithat{

	@Override
	public String getThongtin() {
		// TODO Auto-generated method stub
		return "Ghe("+vatlieu.getMota()+")";
	}

	public Ghe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ghe(String maso, double dongia, Vatlieu vatlieu) {
		super(maso, dongia, vatlieu);
		// TODO Auto-generated constructor stub
	}

	public Ghe(Vatlieu vatlieu) {
		super(vatlieu);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
//	public Ghe(Vatlieu vatlieu) {
//		super(vatlieu);
//	}
//	
//	public Ghe(String maso, double dongia, Vatlieu vatlieu) {
//		super(maso, dongia, vatlieu);
//	}
//
//	@Override
//	public String getThongtin() {
//		return "Ghe (" + vatlieu.getMota()+")";
//	}
	
}
