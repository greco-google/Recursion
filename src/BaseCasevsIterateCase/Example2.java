package BaseCasevsIterateCase;

public class Example2 {

	public int mystery(int n, int a, int b) {
		if(n==0) {
			return a;
		} else {
			return b* mystery(n-1, a, b);
		}
	}
	
}
