import java.util.Iterator;
import java.util.List;

// f(n) = f(n-1) + f(n-2)
public class Fibonacci implements Iterable<Long> {
	
	//private Iterator<Long> current=(long) 1;

	@Override
	public Iterator<Long> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Long>(){
			private long current=0;
			private long f1 = 1;
			private long f2 = 0;
			@Override
			public Long next() {
				long temp = current;
				current = f1 + f2;
				f2 = temp;
				f1 = current;
				return current;
			}
			@Override
			public boolean hasNext() {
				return true;
			}
		};
		///loop
		
	}

}
