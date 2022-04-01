
public class Number implements Term {
	private int num;
	
	public Number(int _number) {
		this.num = _number;
	}
	
	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return num;
	}

}
