
public class VerifyData {
	
// verify input data from parent object "Input" and choice of solution method.
	
	public void dataIn(double a, double b, double c) {
		if ( a == 0) {
//	linear equation solution.
			System.out.println( "Linear equation:" );
			
			Linear lnr = new Linear();
			lnr._calc( b, c );
		}
		else {
// 	square equation solution.
				System.out.println( "Square equation:" );
				Square sqr = new Square();
				sqr._calc( a, b, c );
			}
		
		
	}
	
	

}
