package m02.s10;

public class While {
	public static void main(String[] args) {
        boolean condition = true;
        int value = 3;
        
        while (condition) {
            System.out.println("Something is true and value is: " + value);
            
            
		if (value > 0) {
			value -=  1;
		} else {
			condition = false;	
	    }
     }	
  }
}
