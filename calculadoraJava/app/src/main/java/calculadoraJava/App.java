/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package calculadoraJava;

public class App {
    public int calculadora(int num1, int num2, String operador) {
    	
    	int res = 0;
    	switch (operador){
    		case "+":
    			res = num1 + num2;
    			break;
    		case "-":    			
                res = num1 - num2;                
    			break;
    		case "*":
    			res = num1 * num2;
    			break;
    		case "/":
    			if (num1 > num2) {
                    return 0;
                } else {
    			res = num1 / num2;
                }
    			break;
    		default:
    			
    	}
    	return res;
    }

    
}
