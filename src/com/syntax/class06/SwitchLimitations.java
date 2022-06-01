package com.syntax.class06;

public class SwitchLimitations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*switch can work with byte, short, int, char, string
		 * 
		 * switch has a datatype limitations
		 * 
		 * switch cannot work with double, float, long, boolean
		 */
		
		double price=10;
		
		/*switch(price) { //CE(compiler error): Cannot switch on a value of type double.
		 * }
		 */
		
		boolean hungry=true;
		/*switch(hungry) { -->CE: cannot switch on a value of type boolean
		}
		*switch has operators limitations
		*cannot use logical operators inside switch
		*cannot use relational operators
		*/
	char choice='Y';
	String meaning;
	case 'Y' || 'y':
		meaning="Yes";
		break;
		
	}

}
