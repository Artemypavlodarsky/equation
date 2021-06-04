
public class Linear {
	
//	linear equation solution .
	
	public void _calc( double b, double c ) {
		double x;
		String out ="";
		
		if ( b != 0 ) {
			
			x =  -(c/b) ;
			
			out = String.format( "Root X=%.2f", x );
			System.out.println( out );
			
		} else if ( c != 0 ) {
			
			System.out.println( "The equation has no root." );
			
			} else if (c == 0) {
				System.out.println( "The equation has an infinite number of roots." );
			}

	}

}
