package Bai1_Xe_factorymethod;

public class Client extends Honda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IXeFactory factory = new XeFactory();
		
		Toyota toyota = (Toyota)factory.create("toyota");
		System.out.println(toyota.getthongtin());
		
		Honda honda = (Honda)factory.create("honda");
		System.out.println(honda.getthongtin());
	}
}
