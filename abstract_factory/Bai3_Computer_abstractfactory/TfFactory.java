package Bai3_Computer_abstractfactory;

public class TfFactory implements iComputerFactory{

	@Override
	public Mac createMac() {
		// TODO Auto-generated method stub
		return new TfMac();
	}

	@Override
	public Windown createWindown() {
		// TODO Auto-generated method stub
		return new TfWindown();
	}

	@Override
	public Linux createLinux() {
		// TODO Auto-generated method stub
		return new TfLinux();
	}

}
