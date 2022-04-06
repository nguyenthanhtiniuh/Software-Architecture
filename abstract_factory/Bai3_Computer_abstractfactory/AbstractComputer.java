package Bai3_Computer_abstractfactory;

public abstract class AbstractComputer {
	private double name;

	public double getName() {
		return name;
	}

	public void setName(double name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AbstractComputer [name=" + name + "]";
	}
	
	public abstract String getThongtin();
}
