package test_abstract_factory_pattern;

public class ShapeFactory extends AbstractFactory{

	public ShapeFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
