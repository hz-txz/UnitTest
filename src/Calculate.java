
public class Calculate {
	
	private static int result;    //��̬���������ڴ洢���н��
    
	public static void add(int n)
    {
        result = result + n;
    }
    
    public static void substract(int n)
    {
        result = result - n;        //Bug����ȷ��Ӧ����result=result-n;
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
        for(;;);    //Bug:��ѭ�� 
    }
    
    public static void clear()
    {
        result =  0;  //���������
    }
    
    public static int getResult()
    {
        return result;
    }
}
