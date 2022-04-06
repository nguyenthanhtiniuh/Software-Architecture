package example;

public class Context {
	private Strategy stragery;

	public Context(Strategy stragery) {		
		this.stragery = stragery;
	}
	
	public int executeStrategy(int num1,int num2) {
		return stragery.doOperation(num1, num2);
	}
}
