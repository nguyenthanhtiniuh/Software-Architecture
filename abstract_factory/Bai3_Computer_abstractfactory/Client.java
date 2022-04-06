package Bai3_Computer_abstractfactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iComputerFactory factory = new UiFactory();
		
		UiLinux uilinux = (UiLinux)factory.createLinux();
		System.out.println(uilinux.getThongtin());
		
		UiMac uimac=(UiMac)factory.createMac();
		System.out.println(uimac.getThongtin());
		
		
		
	}

}
