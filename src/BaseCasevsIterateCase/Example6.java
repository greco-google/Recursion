package BaseCasevsIterateCase;

public class Example6 {
	
	public int result(int n) {
		if(n==1) {
			return 2;
		} else {
			return 2 * result(n-1);
		}
	}

}
