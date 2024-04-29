
class NewException { 
	public static void main (String[] args) { 
	int p=50; 
	int q=0; 

		try{ 
		System.out.println(p/q); 
		} 
	catch(ArithmeticException e){ 

		System.out.println(e.getMessage()); 
        
	} 
	} 
} 
