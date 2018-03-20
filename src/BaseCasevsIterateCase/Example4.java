package BaseCasevsIterateCase;

public class Example4 {
	
	public int recur(int n, int a, int b) {
		if(n==1) {
			return a;
		} else {
			return b + recur(n-1, a, b);
		}
	}

}
