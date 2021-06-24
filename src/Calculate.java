
public class Calculate {
	
	private static int result;    //静态变量，用于存储运行结果
    
	public static void add(int n)
    {
        result = result + n;
    }
    
    public static void substract(int n)
    {
        result = result - n;        //Bug：正确的应该是result=result-n;
    }
    
    public static void multiply(int n)
    {
    	result = result * n;
    }
    
    public static void divide(int n)
    {
        result = result / n;
    }
    
    public static void square(int n)
    {
        result  =n * n;
    }
    
    public static void squareRoot(int n)
    {
        for(;;);    //Bug:死循环 
    }
    
    public static void clear()
    {
        result =  0;  //将结果清零
    }
    
    public static int getResult()
    {
        return result;
    }
}
