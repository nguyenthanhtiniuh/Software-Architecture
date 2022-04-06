package Bai2_Mathang_abstractfactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMathangFactory factory = new MyFactory();
		
		QuanaoMy quanaomy=(QuanaoMy)factory.createQuanao();
		System.out.println(quanaomy.getThongtin());
	}
}
