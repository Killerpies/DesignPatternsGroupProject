
public class Factorial extends UnaryOperator {
	
	
	
	public Factorial(Term _one) {
		super(_one);
		if (getTerm().getValue() < 0) {
			throw new IllegalArgumentException("negative value: " + getTerm().getValue());
		}
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		
		int total = 1;
		for (int i = getTerm().getValue(); i>0; i--) {
			total *= i;
		}
		return total;
	}


}
