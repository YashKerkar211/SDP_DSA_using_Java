class DynamicProgrammingT1 {
    
    public static int fibonacci(int num) {
        //If passed input is 0, return 0
		 if (num == 0)
		     return 0;
		//If passed input is 1, return 1
	 	 else if(num == 1)
	 		 return 1;
	 	 else
	 		 return fibonacci(num - 1) + fibonacci(num - 2); 
	 } 
    
	public static void main(String[] args) { 
	    int num = 5; 
		System.out.println(num+"th fibaonacci number: "+fibonacci(num)); 
    } 
}
