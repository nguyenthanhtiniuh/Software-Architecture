package exmple;

public class Client {
	public static void main(String[] args) {
		Vatlieu vatlieu = new Go();
		Ban bn = new Ban("BN1", 100, vatlieu , 10, 20);
		Ghe gh = new Ghe("3", 1500, vatlieu);
		System.out.println(bn.getThongtin());
		System.out.println(gh.getThongtin());
	}
}
