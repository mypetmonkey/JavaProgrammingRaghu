
public class Practice {
	
	public static void main(String[] args) {
		int n=7682;
		System.out.println(bigDigit(n));
		
		
	}
static int bigDigit(int n) {
	int big=-9;
	do {
		int d=n%10;
		if(d>big)
			big=d;
		n=n/10;
		
	}while(n!=0);
	return big;
}
	
	
}
