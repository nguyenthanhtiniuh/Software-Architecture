package Bai2_Nganhang_factorymethod;

public abstract class AbstractNganhang {
	private String ttdichvu;
	private String ttkhuyenmai;
	public String getTtdichvu() {
		return ttdichvu;
	}
	public void setTtdichvu(String ttdichvu) {
		this.ttdichvu = ttdichvu;
	}
	public String getTtkhuyenmai() {
		return ttkhuyenmai;
	}
	public void setTtkhuyenmai(String ttkhuyenmai) {
		this.ttkhuyenmai = ttkhuyenmai;
	}
	@Override
	public String toString() {
		return "AbstractNganhang [ttdichvu=" + ttdichvu + ", ttkhuyenmai=" + ttkhuyenmai + "]";
	}
	public abstract String getThongtin();
}
