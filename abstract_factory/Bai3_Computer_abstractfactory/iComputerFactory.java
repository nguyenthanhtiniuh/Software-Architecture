package Bai3_Computer_abstractfactory;

public interface iComputerFactory {
	public Mac createMac();
	
	public Windown createWindown();
	
	public Linux createLinux();
}

