import java.util.HashSet;
import java.util.Set;

public class CensusOffice implements Observable {
	private Set<Observer> observers = new HashSet<>();
	private int number;
	private City thing;
	public CensusOffice(int number) {
		if (number <= 0) {
			throw new IllegalArgumentException( String.format("office number must greater that 0 [%d]", number ));
		}
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public City getReported() { // may need to change
		return thing;
	}
	
	public void report(City latest) {
		this.thing = latest;
		for (var o : observers) {
			o.update( this );
		}
	}
	
	

	@Override
	public boolean addObserver(Observer observer) {
		// TODO Auto-generated method stub
		return observers.add( observer);
	}

	@Override
	public boolean removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		return  observers.remove( observer);
	}

	@Override
	public boolean hasObservers() {
		// TODO Auto-generated method stub
		return !observers.isEmpty();
	}	

}
