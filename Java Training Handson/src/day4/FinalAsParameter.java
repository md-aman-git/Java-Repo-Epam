package day4;
class Maths{
	
	int cube( final int n) {
		//n=n+1;  this gives error
		//return n*n*n;
		int b= n;
		b=b+1;
		return b*b*b;
	}
}
public class FinalAsParameter {
	public static void main(String[] args) {
		
		Maths m= new Maths();
		System.out.println(m.cube(6));
	}
}