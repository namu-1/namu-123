package java1;

public class simplepr {
	public static void main(String[] args) {
		int n=153;
		int s=0;
		int t;
		
		while(n>0) {
			t=n%10;
			s=(t*t*t)+s;
			n=n/10;
			
		}
		
		System.out.println(s);
	}

}

