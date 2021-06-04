

public class Square {
	
// square equation solution.	
	
	public void _calc( double a, double b, double c ) {
		double x1;
		double x2;
		double discr;
		String out ="";

		discr = b * b - 4 * a * c;
		
		System.out.println( "Discriminant D = " + discr);
		
		if ( discr > 0 ) {
			
			System.out.println( "D > 0 - In equation TWO root:" );
			
			x1 = ( -b + Math.sqrt(discr)) / ( 2 * a );
			x2 = ( -b - Math.sqrt(discr)) / ( 2 * a );
			
			out = String.format( "X1=%.2f \nX2=%.2f", x1, x2 );
			System.out.println( out );
			
		} else if (discr == 0) {
			
				System.out.println( "D = 0 - In equation ONE root:" );
				x1 = -b/ ( 2 * a );
			
				out = String.format( "X=%.2f", x1 );
				System.out.printf( out );
				
				} else {
					
					System.out.print( "No roots!" );
					
					}

	}
	
	
}
