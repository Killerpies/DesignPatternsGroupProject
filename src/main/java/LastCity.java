
public class LastCity implements Observer {
	
	private City lastCity;
	private CensusOffice lastOffice;
	
	public City getLastCity() {
		return lastCity;
	}
	
	public CensusOffice getLastOffice() {
		return lastOffice;
	}

	@Override
	public void update(Observable observable) {
		if (observable instanceof CensusOffice) {
			CensusOffice x = ((CensusOffice) observable);
			lastOffice = x;
			lastCity = x.getReported();
			
		}

	}

}
