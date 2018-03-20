package BaseCasevsIterateCase;

public class Example1 {

	public int mystery(int n) {
		if(n<0) {
			return n*2;
		} else {
			return mystery(n-1) + mystery(n-2);
		}
	}
	
}
