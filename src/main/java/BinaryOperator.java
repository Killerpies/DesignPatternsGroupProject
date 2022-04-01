
public abstract class BinaryOperator implements Term {
	private Term left;
	private Term right;
	
	protected BinaryOperator(Term _left, Term _right){
		if (_left == null) {
			throw new IllegalArgumentException("Left term cannot be null");
		}
		else if (_right == null) {
			throw new IllegalArgumentException("Right term cannot be null");
		}
		this.left = _left;
		this.right = _right;
	}
	
	protected Term getLeft() {
		return this.left;
	}
	
	protected Term getRight() {
		return this.right;
		
	}
	
}
