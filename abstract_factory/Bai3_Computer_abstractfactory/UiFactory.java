package Bai3_Computer_abstractfactory;

public class UiFactory implements iComputerFactory{

	@Override
	public Mac createMac() {
		// TODO Auto-generated method stub
		return new UiMac();
	}

	@Override
	public Windown createWindown() {
		// TODO Auto-generated method stub
		return new UiWindown();
	}

	@Override
	public Linux createLinux() {
		// TODO Auto-generated method stub
		return new UiLinux();
	}

	

}
