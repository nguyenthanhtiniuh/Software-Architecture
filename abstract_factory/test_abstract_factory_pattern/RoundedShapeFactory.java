package test_abstract_factory_pattern;

public class RoundedShapeFactory extends AbstractFactory{

	public RoundedShapeFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RoundedRectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new RoundedRectangle();
		}
		return null;
	}

}
