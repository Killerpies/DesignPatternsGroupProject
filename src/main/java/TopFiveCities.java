import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TopFiveCities implements Observer {
	
	private List<City> observers = new ArrayList<City>();
//	private Set<Observer> observers = new HashSet<>();
	
	public List<City> getTopFive(){
		int _size ;
		List<City> temp = new ArrayList<City>();
		for(int k = 0; k<observers.size();k++) {
			temp.add(observers.get(k));
		}
		ArrayList<City> topFive = new ArrayList<City>();
		if (observers.size()<5) {
			_size = observers.size();
		}
		else {
			_size  = 5;
		}
		for(int g =0; g<_size; g++) {
			int max = 0;
			int max_loc = 0;
			for(int i = 0; i< temp.size(); i++) {
				if (temp.get(i).getPopulation() > max) {
					max = temp.get(i).getPopulation();
					max_loc = i;
				}
			}
			topFive.add(temp.get(max_loc));
			temp.remove(max_loc);
		}
		return topFive; // need to sort
	}

	@Override
	public void update(Observable observable) {
		if (observable instanceof CensusOffice) {
			CensusOffice x = ((CensusOffice) observable);
			observers.add(x.getReported());
			
		}
		// TODO Auto-generated method stub

	}

}
