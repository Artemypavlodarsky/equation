
/*	Decisions in this program take the form depending on the received coefficients:
 * 		1. full square equation;
 * 		2. incomplete square equation;
 * 		3. linear equation in one variable.
 *  
 *  Coefficients accepted by class Input, contained method dataIn of class VerifyData: a, b, c.
 * 
 * Structure of my first small application
 * 
 * 			  Input
 * 				|
 * 			VerufyData
 * 			/		\
 *		Square		Linear
 * 
 */

public class Input {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		VerifyData vrfy= new VerifyData();
//	input data for processing
		vrfy.dataIn(9, 18, 8 );
		
		
	}

}
