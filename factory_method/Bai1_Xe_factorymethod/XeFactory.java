package Bai1_Xe_factorymethod;

public class XeFactory implements IXeFactory{

	@Override
	public Xe create(String loaixe) {
		// TODO Auto-generated method stub
		loaixe = loaixe.toLowerCase();
		switch(loaixe) {
		case "honda":
			return new Honda();			
		case "nexus":
			return new Nexus();			
		case "toyota":
			return new Toyota();		
		default:
			break;		
		}
		return null;
	}

}
