
public abstract class UnaryOperator implements Term {
	private Term one;
	
	protected UnaryOperator(Term _one){
		if (_one == null) {
			throw new IllegalArgumentException("Term cannot be null");
		}
		this.one = _one;
	}
	
	protected Term getTerm() {
		return one;
	}
	
}
