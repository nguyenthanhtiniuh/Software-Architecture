package Bai3_Computer_abstractfactory;

public class ButtonFactory implements iComputerFactory{

	@Override
	public Mac createMac() {
		// TODO Auto-generated method stub
		return new ButtonMac();
	}

	@Override
	public Windown createWindown() {
		// TODO Auto-generated method stub
		return new ButtonWindown();
	}

	@Override
	public Linux createLinux() {
		// TODO Auto-generated method stub
		return new ButtonLinux();
	}

	

}
