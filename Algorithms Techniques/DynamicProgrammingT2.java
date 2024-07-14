class DynamicProgrammingT2{
	
    public static int fibonacci(int num) { 
        //Declare an array to store Fibonacci numbers
        int f[] = new int[num + 1]; 
        int index; 
  
        //0th and 1st number of the series are 0 and 1
        f[0] = 0; 
  
        if (num > 0) { 
            f[1] = 1; 
  
            for (index = 2; index <= num; index++) { 
                //Add the previous 2 numbers in the series and store the sum
                f[index] = f[index - 1] + f[index - 2]; 
            } 
        } 
  
        return f[num]; 
    } 
    
    public static void main(String[] args) { 
        int num = 9; 
		System.out.println(num+"th fibonacci number : "+fibonacci(num)); 
    } 
}

