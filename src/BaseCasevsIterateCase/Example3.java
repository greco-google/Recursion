package BaseCasevsIterateCase;

public class Example3 {
	
	public int recur(int n) {
		if(n <= 10) {
			return n*2;
		} else {
			return recur(recur(n/3));
		}
	}

}
