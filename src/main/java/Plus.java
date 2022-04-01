
public class Plus extends BinaryOperator {

	
	protected Plus(Term _left, Term _right) {
		super(_left, _right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return getLeft().getValue() + getRight().getValue();
	}

}
