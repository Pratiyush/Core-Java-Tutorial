package demo.assertions;

import java.util.logging.Logger;

public class Calculator {
	private static final Logger logger = Logger.getLogger("demo.assertions.Calculator");
	
	static int count=0;
	int test=0;

    double add(double a, double b) {
    	double result;
        result = a + b;
        logger.fine("Result of add="+result);
        return result;
    }

    double subtract(double a, double b) {
    	double result;
        result = a - b;
        logger.fine("Result of subtraction="+result);
        return result;
    }

    double multiply(double a, double b) {
    	double result;
        result = a * b;
        logger.fine("Result of multiply="+result);
        return result;
    }

    double divide(double a, double b) {
    	double result=0.0;
    	assert b != 0: "b cannot be 0";
        result = a / b;
        logger.fine("Result of divide="+result);
        return result;
    }

    double modulus(double a, double b) {
    	double result;
        result = a % b;
        logger.fine("Result of modulus="+result);
        return result;
    }

    double sqrt(double a) {
    	double result;
    	assert (a>0.0);
        result = Math.sqrt(a);
        logger.fine("Result of sqrt="+result);
        return result;
    }

    double power(double a, double b) {
    	double result;
        result = Math.pow(a, b);
        logger.fine("Result of power="+result);
        return result;
    }

    public static void main(String[] args) {
        double i=5.0;
        double j=6.0;
        double result;
        Calculator cal = new Calculator();
        result = cal.add(i, j);
        logger.info("Addition of " + i + " and " + j + " yields " + result);
        
        double k=9.0; // Change k to -9.0 to see the assertion error.
        result = cal.sqrt(k);
        logger.info("SquareRoot of " + k + " yields " + result);
        
        double l=1.0; // Change l to 0.0 to see the assertion error.
        result = cal.divide(i,l);
        logger.info("Division of " + i + " by " + l + " yields " + result);

    }
}
