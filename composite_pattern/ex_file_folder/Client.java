package ex_file_folder;

public class Client {
	public static void main(String[] args) {
		Folder x = new Folder();
		Folder y;
		x.add(y = new Folder());
		y.add(new File("dssv.txt", 10));
		y.add(new File("btthuchanh.pdf", 100));
		x.add(new File("bangdiem.xlsx", 150));
		
		IDirectory rm = x;
		
		System.out.println(rm.getName());
		System.out.println(rm.getSize());
	}
}
